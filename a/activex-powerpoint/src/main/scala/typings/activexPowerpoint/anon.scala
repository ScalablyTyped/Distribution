package typings.activexPowerpoint

import typings.activexOffice.Office.MsoSyncEventType
import typings.activexPowerpoint.PowerPoint.DocumentWindow
import typings.activexPowerpoint.PowerPoint.Effect
import typings.activexPowerpoint.PowerPoint.PpProtectedViewCloseReason
import typings.activexPowerpoint.PowerPoint.Presentation
import typings.activexPowerpoint.PowerPoint.ProtectedViewWindow
import typings.activexPowerpoint.PowerPoint.Selection
import typings.activexPowerpoint.PowerPoint.Slide
import typings.activexPowerpoint.PowerPoint.SlideRange
import typings.activexPowerpoint.PowerPoint.SlideShowWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cancel extends StObject {
    
    var Cancel: Boolean
    
    val Pres: Presentation
  }
  object Cancel {
    
    @scala.inline
    def apply(Cancel: Boolean, Pres: Presentation): Cancel = {
      val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Pres = Pres.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cancel]
    }
    
    @scala.inline
    implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPres(value: Presentation): Self = StObject.set(x, "Pres", value.asInstanceOf[js.Any])
    }
  }
  
  trait CancelProtViewWindow extends StObject {
    
    var Cancel: Boolean
    
    val ProtViewWindow: ProtectedViewWindow
  }
  object CancelProtViewWindow {
    
    @scala.inline
    def apply(Cancel: Boolean, ProtViewWindow: ProtectedViewWindow): CancelProtViewWindow = {
      val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ProtViewWindow = ProtViewWindow.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancelProtViewWindow]
    }
    
    @scala.inline
    implicit class CancelProtViewWindowMutableBuilder[Self <: CancelProtViewWindow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtViewWindow(value: ProtectedViewWindow): Self = StObject.set(x, "ProtViewWindow", value.asInstanceOf[js.Any])
    }
  }
  
  trait NEffect extends StObject {
    
    val Wn: SlideShowWindow
    
    val nEffect: Effect
  }
  object NEffect {
    
    @scala.inline
    def apply(Wn: SlideShowWindow, nEffect: Effect): NEffect = {
      val __obj = js.Dynamic.literal(Wn = Wn.asInstanceOf[js.Any], nEffect = nEffect.asInstanceOf[js.Any])
      __obj.asInstanceOf[NEffect]
    }
    
    @scala.inline
    implicit class NEffectMutableBuilder[Self <: NEffect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNEffect(value: Effect): Self = StObject.set(x, "nEffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWn(value: SlideShowWindow): Self = StObject.set(x, "Wn", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pres extends StObject {
    
    val Pres: Presentation
  }
  object Pres {
    
    @scala.inline
    def apply(Pres: Presentation): Pres = {
      val __obj = js.Dynamic.literal(Pres = Pres.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pres]
    }
    
    @scala.inline
    implicit class PresMutableBuilder[Self <: Pres] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPres(value: Presentation): Self = StObject.set(x, "Pres", value.asInstanceOf[js.Any])
    }
  }
  
  trait PresWn extends StObject {
    
    val Pres: Presentation
    
    val Wn: DocumentWindow
  }
  object PresWn {
    
    @scala.inline
    def apply(Pres: Presentation, Wn: DocumentWindow): PresWn = {
      val __obj = js.Dynamic.literal(Pres = Pres.asInstanceOf[js.Any], Wn = Wn.asInstanceOf[js.Any])
      __obj.asInstanceOf[PresWn]
    }
    
    @scala.inline
    implicit class PresWnMutableBuilder[Self <: PresWn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPres(value: Presentation): Self = StObject.set(x, "Pres", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWn(value: DocumentWindow): Self = StObject.set(x, "Wn", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProtViewWindow extends StObject {
    
    val ProtViewWindow: ProtectedViewWindow
  }
  object ProtViewWindow {
    
    @scala.inline
    def apply(ProtViewWindow: ProtectedViewWindow): ProtViewWindow = {
      val __obj = js.Dynamic.literal(ProtViewWindow = ProtViewWindow.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtViewWindow]
    }
    
    @scala.inline
    implicit class ProtViewWindowMutableBuilder[Self <: ProtViewWindow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProtViewWindow(value: ProtectedViewWindow): Self = StObject.set(x, "ProtViewWindow", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProtectedViewCloseReason extends StObject {
    
    var Cancel: Boolean
    
    val ProtViewWindow: ProtectedViewWindow
    
    val ProtectedViewCloseReason: PpProtectedViewCloseReason
  }
  object ProtectedViewCloseReason {
    
    @scala.inline
    def apply(
      Cancel: Boolean,
      ProtViewWindow: ProtectedViewWindow,
      ProtectedViewCloseReason: PpProtectedViewCloseReason
    ): ProtectedViewCloseReason = {
      val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ProtViewWindow = ProtViewWindow.asInstanceOf[js.Any], ProtectedViewCloseReason = ProtectedViewCloseReason.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtectedViewCloseReason]
    }
    
    @scala.inline
    implicit class ProtectedViewCloseReasonMutableBuilder[Self <: ProtectedViewCloseReason] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtViewWindow(value: ProtectedViewWindow): Self = StObject.set(x, "ProtViewWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectedViewCloseReason(value: PpProtectedViewCloseReason): Self = StObject.set(x, "ProtectedViewCloseReason", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sel extends StObject {
    
    var Cancel: Boolean
    
    val Sel: Selection
  }
  object Sel {
    
    @scala.inline
    def apply(Cancel: Boolean, Sel: Selection): Sel = {
      val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Sel = Sel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sel]
    }
    
    @scala.inline
    implicit class SelMutableBuilder[Self <: Sel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSel(value: Selection): Self = StObject.set(x, "Sel", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelSelection extends StObject {
    
    val Sel: Selection
  }
  object SelSelection {
    
    @scala.inline
    def apply(Sel: Selection): SelSelection = {
      val __obj = js.Dynamic.literal(Sel = Sel.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelSelection]
    }
    
    @scala.inline
    implicit class SelSelectionMutableBuilder[Self <: SelSelection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSel(value: Selection): Self = StObject.set(x, "Sel", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sld extends StObject {
    
    val Sld: Slide
  }
  object Sld {
    
    @scala.inline
    def apply(Sld: Slide): Sld = {
      val __obj = js.Dynamic.literal(Sld = Sld.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sld]
    }
    
    @scala.inline
    implicit class SldMutableBuilder[Self <: Sld] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSld(value: Slide): Self = StObject.set(x, "Sld", value.asInstanceOf[js.Any])
    }
  }
  
  trait SldRange extends StObject {
    
    val SldRange: SlideRange
  }
  object SldRange {
    
    @scala.inline
    def apply(SldRange: SlideRange): SldRange = {
      val __obj = js.Dynamic.literal(SldRange = SldRange.asInstanceOf[js.Any])
      __obj.asInstanceOf[SldRange]
    }
    
    @scala.inline
    implicit class SldRangeMutableBuilder[Self <: SldRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSldRange(value: SlideRange): Self = StObject.set(x, "SldRange", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncEventType extends StObject {
    
    val Pres: Presentation
    
    val SyncEventType: MsoSyncEventType
  }
  object SyncEventType {
    
    @scala.inline
    def apply(Pres: Presentation, SyncEventType: MsoSyncEventType): SyncEventType = {
      val __obj = js.Dynamic.literal(Pres = Pres.asInstanceOf[js.Any], SyncEventType = SyncEventType.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncEventType]
    }
    
    @scala.inline
    implicit class SyncEventTypeMutableBuilder[Self <: SyncEventType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPres(value: Presentation): Self = StObject.set(x, "Pres", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncEventType(value: MsoSyncEventType): Self = StObject.set(x, "SyncEventType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Wn extends StObject {
    
    val Wn: SlideShowWindow
  }
  object Wn {
    
    @scala.inline
    def apply(Wn: SlideShowWindow): Wn = {
      val __obj = js.Dynamic.literal(Wn = Wn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Wn]
    }
    
    @scala.inline
    implicit class WnMutableBuilder[Self <: Wn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWn(value: SlideShowWindow): Self = StObject.set(x, "Wn", value.asInstanceOf[js.Any])
    }
  }
}
