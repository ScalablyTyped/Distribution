package typings.activexOffice

import typings.activexOffice.Office.CommandBarButton
import typings.activexOffice.Office.CommandBarComboBox
import typings.activexOffice.Office.CustomTaskPane
import typings.activexOffice.Office.CustomXMLNode
import typings.activexOffice.Office.CustomXMLPart
import typings.activexStdole.stdole.GUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CNames extends StObject {
    
    val cNames: Double
    
    val lcid: Double
    
    var rgdispid: Double
    
    val rgszNames: Double
    
    val riid: GUID
  }
  object CNames {
    
    inline def apply(cNames: Double, lcid: Double, rgdispid: Double, rgszNames: Double, riid: GUID): CNames = {
      val __obj = js.Dynamic.literal(cNames = cNames.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], rgdispid = rgdispid.asInstanceOf[js.Any], rgszNames = rgszNames.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any])
      __obj.asInstanceOf[CNames]
    }
    
    extension [Self <: CNames](x: Self) {
      
      inline def setCNames(value: Double): Self = StObject.set(x, "cNames", value.asInstanceOf[js.Any])
      
      inline def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
      
      inline def setRgdispid(value: Double): Self = StObject.set(x, "rgdispid", value.asInstanceOf[js.Any])
      
      inline def setRgszNames(value: Double): Self = StObject.set(x, "rgszNames", value.asInstanceOf[js.Any])
      
      inline def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
    }
  }
  
  trait CancelDefault extends StObject {
    
    var CancelDefault: Boolean
    
    val Ctrl: CommandBarButton
  }
  object CancelDefault {
    
    inline def apply(CancelDefault: Boolean, Ctrl: CommandBarButton): CancelDefault = {
      val __obj = js.Dynamic.literal(CancelDefault = CancelDefault.asInstanceOf[js.Any], Ctrl = Ctrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancelDefault]
    }
    
    extension [Self <: CancelDefault](x: Self) {
      
      inline def setCancelDefault(value: Boolean): Self = StObject.set(x, "CancelDefault", value.asInstanceOf[js.Any])
      
      inline def setCtrl(value: CommandBarButton): Self = StObject.set(x, "Ctrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ctrl extends StObject {
    
    val Ctrl: CommandBarComboBox
  }
  object Ctrl {
    
    inline def apply(Ctrl: CommandBarComboBox): Ctrl = {
      val __obj = js.Dynamic.literal(Ctrl = Ctrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ctrl]
    }
    
    extension [Self <: Ctrl](x: Self) {
      
      inline def setCtrl(value: CommandBarComboBox): Self = StObject.set(x, "Ctrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomTaskPaneInst extends StObject {
    
    val CustomTaskPaneInst: CustomTaskPane
  }
  object CustomTaskPaneInst {
    
    inline def apply(CustomTaskPaneInst: CustomTaskPane): CustomTaskPaneInst = {
      val __obj = js.Dynamic.literal(CustomTaskPaneInst = CustomTaskPaneInst.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomTaskPaneInst]
    }
    
    extension [Self <: CustomTaskPaneInst](x: Self) {
      
      inline def setCustomTaskPaneInst(value: CustomTaskPane): Self = StObject.set(x, "CustomTaskPaneInst", value.asInstanceOf[js.Any])
    }
  }
  
  trait InUndoRedo extends StObject {
    
    val InUndoRedo: Boolean
    
    val OldNextSibling: CustomXMLNode
    
    val OldNode: CustomXMLNode
    
    val OldParentNode: CustomXMLNode
  }
  object InUndoRedo {
    
    inline def apply(
      InUndoRedo: Boolean,
      OldNextSibling: CustomXMLNode,
      OldNode: CustomXMLNode,
      OldParentNode: CustomXMLNode
    ): InUndoRedo = {
      val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldNextSibling = OldNextSibling.asInstanceOf[js.Any], OldNode = OldNode.asInstanceOf[js.Any], OldParentNode = OldParentNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[InUndoRedo]
    }
    
    extension [Self <: InUndoRedo](x: Self) {
      
      inline def setInUndoRedo(value: Boolean): Self = StObject.set(x, "InUndoRedo", value.asInstanceOf[js.Any])
      
      inline def setOldNextSibling(value: CustomXMLNode): Self = StObject.set(x, "OldNextSibling", value.asInstanceOf[js.Any])
      
      inline def setOldNode(value: CustomXMLNode): Self = StObject.set(x, "OldNode", value.asInstanceOf[js.Any])
      
      inline def setOldParentNode(value: CustomXMLNode): Self = StObject.set(x, "OldParentNode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Itinfo extends StObject {
    
    val itinfo: Double
    
    val lcid: Double
    
    var pptinfo: Unit
  }
  object Itinfo {
    
    inline def apply(itinfo: Double, lcid: Double, pptinfo: Unit): Itinfo = {
      val __obj = js.Dynamic.literal(itinfo = itinfo.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pptinfo = pptinfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Itinfo]
    }
    
    extension [Self <: Itinfo](x: Self) {
      
      inline def setItinfo(value: Double): Self = StObject.set(x, "itinfo", value.asInstanceOf[js.Any])
      
      inline def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
      
      inline def setPptinfo(value: Unit): Self = StObject.set(x, "pptinfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewNode extends StObject {
    
    val InUndoRedo: Boolean
    
    val NewNode: CustomXMLNode
  }
  object NewNode {
    
    inline def apply(InUndoRedo: Boolean, NewNode: CustomXMLNode): NewNode = {
      val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewNode = NewNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewNode]
    }
    
    extension [Self <: NewNode](x: Self) {
      
      inline def setInUndoRedo(value: Boolean): Self = StObject.set(x, "InUndoRedo", value.asInstanceOf[js.Any])
      
      inline def setNewNode(value: CustomXMLNode): Self = StObject.set(x, "NewNode", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewPart extends StObject {
    
    val NewPart: CustomXMLPart
  }
  object NewPart {
    
    inline def apply(NewPart: CustomXMLPart): NewPart = {
      val __obj = js.Dynamic.literal(NewPart = NewPart.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewPart]
    }
    
    extension [Self <: NewPart](x: Self) {
      
      inline def setNewPart(value: CustomXMLPart): Self = StObject.set(x, "NewPart", value.asInstanceOf[js.Any])
    }
  }
  
  trait OldNode extends StObject {
    
    val InUndoRedo: Boolean
    
    val NewNode: CustomXMLNode
    
    val OldNode: CustomXMLNode
  }
  object OldNode {
    
    inline def apply(InUndoRedo: Boolean, NewNode: CustomXMLNode, OldNode: CustomXMLNode): OldNode = {
      val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewNode = NewNode.asInstanceOf[js.Any], OldNode = OldNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[OldNode]
    }
    
    extension [Self <: OldNode](x: Self) {
      
      inline def setInUndoRedo(value: Boolean): Self = StObject.set(x, "InUndoRedo", value.asInstanceOf[js.Any])
      
      inline def setNewNode(value: CustomXMLNode): Self = StObject.set(x, "NewNode", value.asInstanceOf[js.Any])
      
      inline def setOldNode(value: CustomXMLNode): Self = StObject.set(x, "OldNode", value.asInstanceOf[js.Any])
    }
  }
  
  trait OldPart extends StObject {
    
    val OldPart: CustomXMLPart
  }
  object OldPart {
    
    inline def apply(OldPart: CustomXMLPart): OldPart = {
      val __obj = js.Dynamic.literal(OldPart = OldPart.asInstanceOf[js.Any])
      __obj.asInstanceOf[OldPart]
    }
    
    extension [Self <: OldPart](x: Self) {
      
      inline def setOldPart(value: CustomXMLPart): Self = StObject.set(x, "OldPart", value.asInstanceOf[js.Any])
    }
  }
  
  trait Part extends StObject {
    
    val Part: CustomXMLPart
  }
  object Part {
    
    inline def apply(Part: CustomXMLPart): Part = {
      val __obj = js.Dynamic.literal(Part = Part.asInstanceOf[js.Any])
      __obj.asInstanceOf[Part]
    }
    
    extension [Self <: Part](x: Self) {
      
      inline def setPart(value: CustomXMLPart): Self = StObject.set(x, "Part", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pctinfo extends StObject {
    
    var pctinfo: Double
  }
  object Pctinfo {
    
    inline def apply(pctinfo: Double): Pctinfo = {
      val __obj = js.Dynamic.literal(pctinfo = pctinfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pctinfo]
    }
    
    extension [Self <: Pctinfo](x: Self) {
      
      inline def setPctinfo(value: Double): Self = StObject.set(x, "pctinfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait PpvObj extends StObject {
    
    var ppvObj: Unit
    
    val riid: GUID
  }
  object PpvObj {
    
    inline def apply(ppvObj: Unit, riid: GUID): PpvObj = {
      val __obj = js.Dynamic.literal(ppvObj = ppvObj.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any])
      __obj.asInstanceOf[PpvObj]
    }
    
    extension [Self <: PpvObj](x: Self) {
      
      inline def setPpvObj(value: Unit): Self = StObject.set(x, "ppvObj", value.asInstanceOf[js.Any])
      
      inline def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
    }
  }
}
