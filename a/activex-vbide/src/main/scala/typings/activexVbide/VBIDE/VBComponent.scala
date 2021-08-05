package typings.activexVbide.VBIDE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VBComponent extends StObject {
  
  def Activate(): Unit
  
  val CodeModule: typings.activexVbide.VBIDE.CodeModule
  
  def Collection(index: js.Any): VBComponent
  @JSName("Collection")
  val Collection_Original: VBComponents
  
  val Designer: js.Any
  
  val DesignerID: String
  
  def DesignerWindow(): Window
  
  def Export(FileName: String): Unit
  
  val HasOpenDesigner: Boolean
  
  var Name: String
  
  def Properties(index: js.Any): Property
  @JSName("Properties")
  val Properties_Original: Properties
  
  val Saved: Boolean
  
  val Type: vbextComponentType
  
  val VBE: typings.activexVbide.VBIDE.VBE
  
  /* private */ @JSName("VBIDE.VBComponent_typekey")
  var VBIDEDotVBComponent_typekey: VBComponent
}
object VBComponent {
  
  inline def apply(
    Activate: () => Unit,
    CodeModule: CodeModule,
    Collection: VBComponents,
    Designer: js.Any,
    DesignerID: String,
    DesignerWindow: () => Window,
    Export: String => Unit,
    HasOpenDesigner: Boolean,
    Name: String,
    Properties: Properties,
    Saved: Boolean,
    Type: vbextComponentType,
    VBE: VBE,
    VBIDEDotVBComponent_typekey: VBComponent
  ): VBComponent = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), CodeModule = CodeModule.asInstanceOf[js.Any], Collection = Collection.asInstanceOf[js.Any], Designer = Designer.asInstanceOf[js.Any], DesignerID = DesignerID.asInstanceOf[js.Any], DesignerWindow = js.Any.fromFunction0(DesignerWindow), Export = js.Any.fromFunction1(Export), HasOpenDesigner = HasOpenDesigner.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Saved = Saved.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], VBE = VBE.asInstanceOf[js.Any])
    __obj.updateDynamic("VBIDE.VBComponent_typekey")(VBIDEDotVBComponent_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[VBComponent]
  }
  
  extension [Self <: VBComponent](x: Self) {
    
    inline def setActivate(value: () => Unit): Self = StObject.set(x, "Activate", js.Any.fromFunction0(value))
    
    inline def setCodeModule(value: CodeModule): Self = StObject.set(x, "CodeModule", value.asInstanceOf[js.Any])
    
    inline def setCollection(value: VBComponents): Self = StObject.set(x, "Collection", value.asInstanceOf[js.Any])
    
    inline def setDesigner(value: js.Any): Self = StObject.set(x, "Designer", value.asInstanceOf[js.Any])
    
    inline def setDesignerID(value: String): Self = StObject.set(x, "DesignerID", value.asInstanceOf[js.Any])
    
    inline def setDesignerWindow(value: () => Window): Self = StObject.set(x, "DesignerWindow", js.Any.fromFunction0(value))
    
    inline def setExport(value: String => Unit): Self = StObject.set(x, "Export", js.Any.fromFunction1(value))
    
    inline def setHasOpenDesigner(value: Boolean): Self = StObject.set(x, "HasOpenDesigner", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setSaved(value: Boolean): Self = StObject.set(x, "Saved", value.asInstanceOf[js.Any])
    
    inline def setType(value: vbextComponentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setVBE(value: VBE): Self = StObject.set(x, "VBE", value.asInstanceOf[js.Any])
    
    inline def setVBIDEDotVBComponent_typekey(value: VBComponent): Self = StObject.set(x, "VBIDE.VBComponent_typekey", value.asInstanceOf[js.Any])
  }
}
