package typings.activexInfopath.InfoPath

import typings.activexAdodb.ADODB.Error
import typings.activexAdodb.ADODB.Errors
import typings.activexMsxml2.MSXML2.IXMLDOMDocument
import typings.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XDocument extends StObject {
  
  def CreateDOM(): IXMLDOMDocument
  
  val DOM: IXMLDOMDocument
  
  val DataAdapters: DataAdaptersCollection
  
  val DataObjects: DataObjectsCollection
  
  def Errors(Index: js.Any): Error
  @JSName("Errors")
  val Errors_Original: Errors
  
  val Extension: js.Any
  
  def GetDOM(bstrName: String): IXMLDOMDocument
  
  def GetDataVariable(lVariableNumber: Double): String
  
  def GetNamedNodeProperty(varMainDOMNode: js.Any, bstrPropertyName: String, bstrDefaultValue: String): String
  
  def ImportDOM(pxDoc: IXMLDOMDocument): Unit
  
  def ImportFile(bstrFileURI: String): Unit
  
  @JSName("InfoPath.XDocument_typekey")
  var InfoPathDotXDocument_typekey: XDocument
  
  val IsDOMReadOnly: Boolean
  
  val IsDirty: Boolean
  
  val IsNew: Boolean
  
  val IsReadOnly: Boolean
  
  val IsRecovered: Boolean
  
  val IsSigned: Boolean
  
  var Language: String
  
  def PrintOut(): Unit
  
  def Query(): Unit
  
  val QueryAdapter: js.Any
  
  var Role: String
  
  def Save(): Unit
  
  def SaveAs(bstrFileUrl: String): Unit
  
  def SetDataVariable(lVariableNumber: Double, bstrVariableValue: String): Unit
  
  def SetDirty(vfIsDirty: Boolean): Unit
  
  def SetNamedNodeProperty(pxmlMainDOMNode: IXMLDOMNode, bstrPropertyName: String, bstrValue: String): Unit
  
  val SignedDataBlocks: SignedDataBlocksCollection
  
  val Solution: SolutionObject
  
  def Submit(): Unit
  
  val UI: typings.activexInfopath.InfoPath.UI
  
  val URI: String
  
  val Util: UtilObject
  
  val View: ViewObject
  
  val ViewInfos: ViewInfosCollection
}
object XDocument {
  
  @scala.inline
  def apply(
    CreateDOM: () => IXMLDOMDocument,
    DOM: IXMLDOMDocument,
    DataAdapters: DataAdaptersCollection,
    DataObjects: DataObjectsCollection,
    Errors: Errors,
    Extension: js.Any,
    GetDOM: String => IXMLDOMDocument,
    GetDataVariable: Double => String,
    GetNamedNodeProperty: (js.Any, String, String) => String,
    ImportDOM: IXMLDOMDocument => Unit,
    ImportFile: String => Unit,
    InfoPathDotXDocument_typekey: XDocument,
    IsDOMReadOnly: Boolean,
    IsDirty: Boolean,
    IsNew: Boolean,
    IsReadOnly: Boolean,
    IsRecovered: Boolean,
    IsSigned: Boolean,
    Language: String,
    PrintOut: () => Unit,
    Query: () => Unit,
    QueryAdapter: js.Any,
    Role: String,
    Save: () => Unit,
    SaveAs: String => Unit,
    SetDataVariable: (Double, String) => Unit,
    SetDirty: Boolean => Unit,
    SetNamedNodeProperty: (IXMLDOMNode, String, String) => Unit,
    SignedDataBlocks: SignedDataBlocksCollection,
    Solution: SolutionObject,
    Submit: () => Unit,
    UI: UI,
    URI: String,
    Util: UtilObject,
    View: ViewObject,
    ViewInfos: ViewInfosCollection
  ): XDocument = {
    val __obj = js.Dynamic.literal(CreateDOM = js.Any.fromFunction0(CreateDOM), DOM = DOM.asInstanceOf[js.Any], DataAdapters = DataAdapters.asInstanceOf[js.Any], DataObjects = DataObjects.asInstanceOf[js.Any], Errors = Errors.asInstanceOf[js.Any], Extension = Extension.asInstanceOf[js.Any], GetDOM = js.Any.fromFunction1(GetDOM), GetDataVariable = js.Any.fromFunction1(GetDataVariable), GetNamedNodeProperty = js.Any.fromFunction3(GetNamedNodeProperty), ImportDOM = js.Any.fromFunction1(ImportDOM), ImportFile = js.Any.fromFunction1(ImportFile), IsDOMReadOnly = IsDOMReadOnly.asInstanceOf[js.Any], IsDirty = IsDirty.asInstanceOf[js.Any], IsNew = IsNew.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], IsRecovered = IsRecovered.asInstanceOf[js.Any], IsSigned = IsSigned.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], PrintOut = js.Any.fromFunction0(PrintOut), Query = js.Any.fromFunction0(Query), QueryAdapter = QueryAdapter.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), SaveAs = js.Any.fromFunction1(SaveAs), SetDataVariable = js.Any.fromFunction2(SetDataVariable), SetDirty = js.Any.fromFunction1(SetDirty), SetNamedNodeProperty = js.Any.fromFunction3(SetNamedNodeProperty), SignedDataBlocks = SignedDataBlocks.asInstanceOf[js.Any], Solution = Solution.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), UI = UI.asInstanceOf[js.Any], URI = URI.asInstanceOf[js.Any], Util = Util.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], ViewInfos = ViewInfos.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.XDocument_typekey")(InfoPathDotXDocument_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDocument]
  }
  
  @scala.inline
  implicit class XDocumentMutableBuilder[Self <: XDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDOM(value: () => IXMLDOMDocument): Self = StObject.set(x, "CreateDOM", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDOM(value: IXMLDOMDocument): Self = StObject.set(x, "DOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAdapters(value: DataAdaptersCollection): Self = StObject.set(x, "DataAdapters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataObjects(value: DataObjectsCollection): Self = StObject.set(x, "DataObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: Errors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: js.Any): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDOM(value: String => IXMLDOMDocument): Self = StObject.set(x, "GetDOM", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDataVariable(value: Double => String): Self = StObject.set(x, "GetDataVariable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNamedNodeProperty(value: (js.Any, String, String) => String): Self = StObject.set(x, "GetNamedNodeProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def setImportDOM(value: IXMLDOMDocument => Unit): Self = StObject.set(x, "ImportDOM", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImportFile(value: String => Unit): Self = StObject.set(x, "ImportFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfoPathDotXDocument_typekey(value: XDocument): Self = StObject.set(x, "InfoPath.XDocument_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDOMReadOnly(value: Boolean): Self = StObject.set(x, "IsDOMReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirty(value: Boolean): Self = StObject.set(x, "IsDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNew(value: Boolean): Self = StObject.set(x, "IsNew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = StObject.set(x, "IsReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRecovered(value: Boolean): Self = StObject.set(x, "IsRecovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSigned(value: Boolean): Self = StObject.set(x, "IsSigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintOut(value: () => Unit): Self = StObject.set(x, "PrintOut", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQuery(value: () => Unit): Self = StObject.set(x, "Query", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryAdapter(value: js.Any): Self = StObject.set(x, "QueryAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSaveAs(value: String => Unit): Self = StObject.set(x, "SaveAs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDataVariable(value: (Double, String) => Unit): Self = StObject.set(x, "SetDataVariable", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDirty(value: Boolean => Unit): Self = StObject.set(x, "SetDirty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNamedNodeProperty(value: (IXMLDOMNode, String, String) => Unit): Self = StObject.set(x, "SetNamedNodeProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSignedDataBlocks(value: SignedDataBlocksCollection): Self = StObject.set(x, "SignedDataBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolution(value: SolutionObject): Self = StObject.set(x, "Solution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmit(value: () => Unit): Self = StObject.set(x, "Submit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUI(value: UI): Self = StObject.set(x, "UI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtil(value: UtilObject): Self = StObject.set(x, "Util", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: ViewObject): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewInfos(value: ViewInfosCollection): Self = StObject.set(x, "ViewInfos", value.asInstanceOf[js.Any])
  }
}
