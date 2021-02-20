package typings.activexOffice

import typings.activexOffice.Office.CommandBarButton
import typings.activexOffice.Office.CommandBarComboBox
import typings.activexOffice.Office.CustomTaskPane
import typings.activexOffice.Office.CustomXMLNode
import typings.activexOffice.Office.CustomXMLPart
import typings.activexStdole.stdole.GUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CNames extends StObject {
    
    val cNames: Double = js.native
    
    val lcid: Double = js.native
    
    var rgdispid: Double = js.native
    
    val rgszNames: Double = js.native
    
    val riid: GUID = js.native
  }
  object CNames {
    
    @scala.inline
    def apply(cNames: Double, lcid: Double, rgdispid: Double, rgszNames: Double, riid: GUID): CNames = {
      val __obj = js.Dynamic.literal(cNames = cNames.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], rgdispid = rgdispid.asInstanceOf[js.Any], rgszNames = rgszNames.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any])
      __obj.asInstanceOf[CNames]
    }
    
    @scala.inline
    implicit class CNamesMutableBuilder[Self <: CNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCNames(value: Double): Self = StObject.set(x, "cNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRgdispid(value: Double): Self = StObject.set(x, "rgdispid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRgszNames(value: Double): Self = StObject.set(x, "rgszNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CancelDefault extends StObject {
    
    var CancelDefault: Boolean = js.native
    
    val Ctrl: CommandBarButton = js.native
  }
  object CancelDefault {
    
    @scala.inline
    def apply(CancelDefault: Boolean, Ctrl: CommandBarButton): CancelDefault = {
      val __obj = js.Dynamic.literal(CancelDefault = CancelDefault.asInstanceOf[js.Any], Ctrl = Ctrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancelDefault]
    }
    
    @scala.inline
    implicit class CancelDefaultMutableBuilder[Self <: CancelDefault] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelDefault(value: Boolean): Self = StObject.set(x, "CancelDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrl(value: CommandBarButton): Self = StObject.set(x, "Ctrl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ctrl extends StObject {
    
    val Ctrl: CommandBarComboBox = js.native
  }
  object Ctrl {
    
    @scala.inline
    def apply(Ctrl: CommandBarComboBox): Ctrl = {
      val __obj = js.Dynamic.literal(Ctrl = Ctrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ctrl]
    }
    
    @scala.inline
    implicit class CtrlMutableBuilder[Self <: Ctrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtrl(value: CommandBarComboBox): Self = StObject.set(x, "Ctrl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CustomTaskPaneInst extends StObject {
    
    val CustomTaskPaneInst: CustomTaskPane = js.native
  }
  object CustomTaskPaneInst {
    
    @scala.inline
    def apply(CustomTaskPaneInst: CustomTaskPane): CustomTaskPaneInst = {
      val __obj = js.Dynamic.literal(CustomTaskPaneInst = CustomTaskPaneInst.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomTaskPaneInst]
    }
    
    @scala.inline
    implicit class CustomTaskPaneInstMutableBuilder[Self <: CustomTaskPaneInst] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomTaskPaneInst(value: CustomTaskPane): Self = StObject.set(x, "CustomTaskPaneInst", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InUndoRedo extends StObject {
    
    val InUndoRedo: Boolean = js.native
    
    val OldNextSibling: CustomXMLNode = js.native
    
    val OldNode: CustomXMLNode = js.native
    
    val OldParentNode: CustomXMLNode = js.native
  }
  object InUndoRedo {
    
    @scala.inline
    def apply(
      InUndoRedo: Boolean,
      OldNextSibling: CustomXMLNode,
      OldNode: CustomXMLNode,
      OldParentNode: CustomXMLNode
    ): InUndoRedo = {
      val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldNextSibling = OldNextSibling.asInstanceOf[js.Any], OldNode = OldNode.asInstanceOf[js.Any], OldParentNode = OldParentNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[InUndoRedo]
    }
    
    @scala.inline
    implicit class InUndoRedoMutableBuilder[Self <: InUndoRedo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInUndoRedo(value: Boolean): Self = StObject.set(x, "InUndoRedo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldNextSibling(value: CustomXMLNode): Self = StObject.set(x, "OldNextSibling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldNode(value: CustomXMLNode): Self = StObject.set(x, "OldNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldParentNode(value: CustomXMLNode): Self = StObject.set(x, "OldParentNode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Itinfo extends StObject {
    
    val itinfo: Double = js.native
    
    val lcid: Double = js.native
    
    var pptinfo: js.UndefOr[scala.Nothing] = js.native
  }
  object Itinfo {
    
    @scala.inline
    def apply(itinfo: Double, lcid: Double): Itinfo = {
      val __obj = js.Dynamic.literal(itinfo = itinfo.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Itinfo]
    }
    
    @scala.inline
    implicit class ItinfoMutableBuilder[Self <: Itinfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItinfo(value: Double): Self = StObject.set(x, "itinfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NewNode extends StObject {
    
    val InUndoRedo: Boolean = js.native
    
    val NewNode: CustomXMLNode = js.native
  }
  object NewNode {
    
    @scala.inline
    def apply(InUndoRedo: Boolean, NewNode: CustomXMLNode): NewNode = {
      val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewNode = NewNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewNode]
    }
    
    @scala.inline
    implicit class NewNodeMutableBuilder[Self <: NewNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInUndoRedo(value: Boolean): Self = StObject.set(x, "InUndoRedo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewNode(value: CustomXMLNode): Self = StObject.set(x, "NewNode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NewPart extends StObject {
    
    val NewPart: CustomXMLPart = js.native
  }
  object NewPart {
    
    @scala.inline
    def apply(NewPart: CustomXMLPart): NewPart = {
      val __obj = js.Dynamic.literal(NewPart = NewPart.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewPart]
    }
    
    @scala.inline
    implicit class NewPartMutableBuilder[Self <: NewPart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewPart(value: CustomXMLPart): Self = StObject.set(x, "NewPart", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OldNode extends StObject {
    
    val InUndoRedo: Boolean = js.native
    
    val NewNode: CustomXMLNode = js.native
    
    val OldNode: CustomXMLNode = js.native
  }
  object OldNode {
    
    @scala.inline
    def apply(InUndoRedo: Boolean, NewNode: CustomXMLNode, OldNode: CustomXMLNode): OldNode = {
      val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewNode = NewNode.asInstanceOf[js.Any], OldNode = OldNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[OldNode]
    }
    
    @scala.inline
    implicit class OldNodeMutableBuilder[Self <: OldNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInUndoRedo(value: Boolean): Self = StObject.set(x, "InUndoRedo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewNode(value: CustomXMLNode): Self = StObject.set(x, "NewNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldNode(value: CustomXMLNode): Self = StObject.set(x, "OldNode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OldPart extends StObject {
    
    val OldPart: CustomXMLPart = js.native
  }
  object OldPart {
    
    @scala.inline
    def apply(OldPart: CustomXMLPart): OldPart = {
      val __obj = js.Dynamic.literal(OldPart = OldPart.asInstanceOf[js.Any])
      __obj.asInstanceOf[OldPart]
    }
    
    @scala.inline
    implicit class OldPartMutableBuilder[Self <: OldPart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOldPart(value: CustomXMLPart): Self = StObject.set(x, "OldPart", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Part extends StObject {
    
    val Part: CustomXMLPart = js.native
  }
  object Part {
    
    @scala.inline
    def apply(Part: CustomXMLPart): Part = {
      val __obj = js.Dynamic.literal(Part = Part.asInstanceOf[js.Any])
      __obj.asInstanceOf[Part]
    }
    
    @scala.inline
    implicit class PartMutableBuilder[Self <: Part] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPart(value: CustomXMLPart): Self = StObject.set(x, "Part", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pctinfo extends StObject {
    
    var pctinfo: Double = js.native
  }
  object Pctinfo {
    
    @scala.inline
    def apply(pctinfo: Double): Pctinfo = {
      val __obj = js.Dynamic.literal(pctinfo = pctinfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pctinfo]
    }
    
    @scala.inline
    implicit class PctinfoMutableBuilder[Self <: Pctinfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPctinfo(value: Double): Self = StObject.set(x, "pctinfo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PpvObj extends StObject {
    
    var ppvObj: js.UndefOr[scala.Nothing] = js.native
    
    val riid: GUID = js.native
  }
  object PpvObj {
    
    @scala.inline
    def apply(riid: GUID): PpvObj = {
      val __obj = js.Dynamic.literal(riid = riid.asInstanceOf[js.Any])
      __obj.asInstanceOf[PpvObj]
    }
    
    @scala.inline
    implicit class PpvObjMutableBuilder[Self <: PpvObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
    }
  }
}
