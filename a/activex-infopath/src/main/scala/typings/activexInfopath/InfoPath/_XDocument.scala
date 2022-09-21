package typings.activexInfopath.InfoPath

import typings.activexAdodb.ADODB.Error
import typings.activexAdodb.ADODB.Errors
import typings.activexMsxml2.MSXML2.IXMLDOMDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _XDocument extends StObject {
  
  val DOM: IXMLDOMDocument
  
  val DataObjects: DataObjectsCollection
  
  def Errors(Index: Any): Error
  @JSName("Errors")
  val Errors_Original: Errors
  
  val Extension: Any
  
  def GetDOM(bstrName: String): IXMLDOMDocument
  
  def GetDataVariable(lVariableNumber: Double): String
  
  def ImportFile(bstrFileURI: String): Unit
  
  /* private */ @JSName("InfoPath._XDocument_typekey")
  var InfoPathDot_XDocument_typekey: _XDocument
  
  val IsDOMReadOnly: Boolean
  
  val IsDirty: Boolean
  
  val IsNew: Boolean
  
  val IsReadOnly: Boolean
  
  val IsSigned: Boolean
  
  var Language: String
  
  def PrintOut(): Unit
  
  def Query(): Unit
  
  val QueryAdapter: Any
  
  def Save(): Unit
  
  def SaveAs(bstrFileUrl: String): Unit
  
  def SetDataVariable(lVariableNumber: Double, bstrVariableValue: String): Unit
  
  val Solution: SolutionObject
  
  def Submit(): Unit
  
  val UI: typings.activexInfopath.InfoPath.UI
  
  val URI: String
  
  val View: ViewObject
  
  val ViewInfos: ViewInfosCollection
}
object _XDocument {
  
  inline def apply(
    DOM: IXMLDOMDocument,
    DataObjects: DataObjectsCollection,
    Errors: Errors,
    Extension: Any,
    GetDOM: String => IXMLDOMDocument,
    GetDataVariable: Double => String,
    ImportFile: String => Unit,
    InfoPathDot_XDocument_typekey: _XDocument,
    IsDOMReadOnly: Boolean,
    IsDirty: Boolean,
    IsNew: Boolean,
    IsReadOnly: Boolean,
    IsSigned: Boolean,
    Language: String,
    PrintOut: () => Unit,
    Query: () => Unit,
    QueryAdapter: Any,
    Save: () => Unit,
    SaveAs: String => Unit,
    SetDataVariable: (Double, String) => Unit,
    Solution: SolutionObject,
    Submit: () => Unit,
    UI: UI,
    URI: String,
    View: ViewObject,
    ViewInfos: ViewInfosCollection
  ): _XDocument = {
    val __obj = js.Dynamic.literal(DOM = DOM.asInstanceOf[js.Any], DataObjects = DataObjects.asInstanceOf[js.Any], Errors = Errors.asInstanceOf[js.Any], Extension = Extension.asInstanceOf[js.Any], GetDOM = js.Any.fromFunction1(GetDOM), GetDataVariable = js.Any.fromFunction1(GetDataVariable), ImportFile = js.Any.fromFunction1(ImportFile), IsDOMReadOnly = IsDOMReadOnly.asInstanceOf[js.Any], IsDirty = IsDirty.asInstanceOf[js.Any], IsNew = IsNew.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], IsSigned = IsSigned.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], PrintOut = js.Any.fromFunction0(PrintOut), Query = js.Any.fromFunction0(Query), QueryAdapter = QueryAdapter.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), SaveAs = js.Any.fromFunction1(SaveAs), SetDataVariable = js.Any.fromFunction2(SetDataVariable), Solution = Solution.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), UI = UI.asInstanceOf[js.Any], URI = URI.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], ViewInfos = ViewInfos.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath._XDocument_typekey")(InfoPathDot_XDocument_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[_XDocument]
  }
  
  extension [Self <: _XDocument](x: Self) {
    
    inline def setDOM(value: IXMLDOMDocument): Self = StObject.set(x, "DOM", value.asInstanceOf[js.Any])
    
    inline def setDataObjects(value: DataObjectsCollection): Self = StObject.set(x, "DataObjects", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: Errors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setExtension(value: Any): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
    
    inline def setGetDOM(value: String => IXMLDOMDocument): Self = StObject.set(x, "GetDOM", js.Any.fromFunction1(value))
    
    inline def setGetDataVariable(value: Double => String): Self = StObject.set(x, "GetDataVariable", js.Any.fromFunction1(value))
    
    inline def setImportFile(value: String => Unit): Self = StObject.set(x, "ImportFile", js.Any.fromFunction1(value))
    
    inline def setInfoPathDot_XDocument_typekey(value: _XDocument): Self = StObject.set(x, "InfoPath._XDocument_typekey", value.asInstanceOf[js.Any])
    
    inline def setIsDOMReadOnly(value: Boolean): Self = StObject.set(x, "IsDOMReadOnly", value.asInstanceOf[js.Any])
    
    inline def setIsDirty(value: Boolean): Self = StObject.set(x, "IsDirty", value.asInstanceOf[js.Any])
    
    inline def setIsNew(value: Boolean): Self = StObject.set(x, "IsNew", value.asInstanceOf[js.Any])
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "IsReadOnly", value.asInstanceOf[js.Any])
    
    inline def setIsSigned(value: Boolean): Self = StObject.set(x, "IsSigned", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setPrintOut(value: () => Unit): Self = StObject.set(x, "PrintOut", js.Any.fromFunction0(value))
    
    inline def setQuery(value: () => Unit): Self = StObject.set(x, "Query", js.Any.fromFunction0(value))
    
    inline def setQueryAdapter(value: Any): Self = StObject.set(x, "QueryAdapter", value.asInstanceOf[js.Any])
    
    inline def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
    
    inline def setSaveAs(value: String => Unit): Self = StObject.set(x, "SaveAs", js.Any.fromFunction1(value))
    
    inline def setSetDataVariable(value: (Double, String) => Unit): Self = StObject.set(x, "SetDataVariable", js.Any.fromFunction2(value))
    
    inline def setSolution(value: SolutionObject): Self = StObject.set(x, "Solution", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: () => Unit): Self = StObject.set(x, "Submit", js.Any.fromFunction0(value))
    
    inline def setUI(value: UI): Self = StObject.set(x, "UI", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewObject): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    
    inline def setViewInfos(value: ViewInfosCollection): Self = StObject.set(x, "ViewInfos", value.asInstanceOf[js.Any])
  }
}
