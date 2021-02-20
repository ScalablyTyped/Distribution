package typings.arrive

import typings.arrive.mod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    // tslint:disable-next-line no-unnecessary-class
    @JSGlobal("Arrive")
    @js.native
    class Arrive () extends StObject
    object Arrive {
      
      @JSGlobal("Arrive")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Arrive.unbindAllArrive")
      @js.native
      def unbindAllArrive: js.Function0[Unit] = js.native
      @scala.inline
      def unbindAllArrive_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unbindAllArrive")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Arrive.unbindAllLeave")
      @js.native
      def unbindAllLeave: js.Function0[Unit] = js.native
      @scala.inline
      def unbindAllLeave_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unbindAllLeave")(x.asInstanceOf[js.Any])
    }
    
    @js.native
    trait Document extends StObject {
      
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def arrive(element: String, handlerOrOptions: Options): Unit = js.native
      def arrive(
        element: String,
        handlerOrOptions: Options,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      @JSName("arrive")
      var arrive_Original: ArriveSignature = js.native
      
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction0[/* this */ Element, Unit]
      ): Unit = js.native
      def leave(element: String, handlerOrOptions: Options): Unit = js.native
      def leave(element: String, handlerOrOptions: Options, handler: js.ThisFunction0[/* this */ Element, Unit]): Unit = js.native
      @JSName("leave")
      var leave_Original: LeaveSignature = js.native
      
      def unbindArrive(): Unit = js.native
      def unbindArrive(
        elementOrHandler: js.UndefOr[scala.Nothing],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindArrive(elementOrHandler: String): Unit = js.native
      def unbindArrive(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindArrive(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit = js.native
      def unbindArrive(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      @JSName("unbindArrive")
      var unbindArrive_Original: UnbindArriveSignature = js.native
      
      def unbindLeave(): Unit = js.native
      def unbindLeave(
        elementOrHandler: js.UndefOr[scala.Nothing],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindLeave(elementOrHandler: String): Unit = js.native
      def unbindLeave(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindLeave(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit = js.native
      def unbindLeave(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      @JSName("unbindLeave")
      var unbindLeave_Original: UnbindLeaveSignature = js.native
    }
    
    @js.native
    trait Element extends StObject {
      
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def arrive(element: String, handlerOrOptions: Options): Unit = js.native
      def arrive(
        element: String,
        handlerOrOptions: Options,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      @JSName("arrive")
      var arrive_Original: ArriveSignature = js.native
      
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction0[/* this */ Element, Unit]
      ): Unit = js.native
      def leave(element: String, handlerOrOptions: Options): Unit = js.native
      def leave(element: String, handlerOrOptions: Options, handler: js.ThisFunction0[/* this */ Element, Unit]): Unit = js.native
      @JSName("leave")
      var leave_Original: LeaveSignature = js.native
      
      def unbindArrive(): Unit = js.native
      def unbindArrive(
        elementOrHandler: js.UndefOr[scala.Nothing],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindArrive(elementOrHandler: String): Unit = js.native
      def unbindArrive(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindArrive(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit = js.native
      def unbindArrive(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      @JSName("unbindArrive")
      var unbindArrive_Original: UnbindArriveSignature = js.native
      
      def unbindLeave(): Unit = js.native
      def unbindLeave(
        elementOrHandler: js.UndefOr[scala.Nothing],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindLeave(elementOrHandler: String): Unit = js.native
      def unbindLeave(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindLeave(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit = js.native
      def unbindLeave(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      @JSName("unbindLeave")
      var unbindLeave_Original: UnbindLeaveSignature = js.native
    }
    
    @js.native
    trait HTMLCollectionBase extends StObject {
      
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def arrive(element: String, handlerOrOptions: Options): Unit = js.native
      def arrive(
        element: String,
        handlerOrOptions: Options,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      @JSName("arrive")
      var arrive_Original: ArriveSignature = js.native
      
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction0[/* this */ Element, Unit]
      ): Unit = js.native
      def leave(element: String, handlerOrOptions: Options): Unit = js.native
      def leave(element: String, handlerOrOptions: Options, handler: js.ThisFunction0[/* this */ Element, Unit]): Unit = js.native
      @JSName("leave")
      var leave_Original: LeaveSignature = js.native
      
      def unbindArrive(): Unit = js.native
      def unbindArrive(
        elementOrHandler: js.UndefOr[scala.Nothing],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindArrive(elementOrHandler: String): Unit = js.native
      def unbindArrive(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindArrive(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit = js.native
      def unbindArrive(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      @JSName("unbindArrive")
      var unbindArrive_Original: UnbindArriveSignature = js.native
      
      def unbindLeave(): Unit = js.native
      def unbindLeave(
        elementOrHandler: js.UndefOr[scala.Nothing],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindLeave(elementOrHandler: String): Unit = js.native
      def unbindLeave(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindLeave(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit = js.native
      def unbindLeave(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      @JSName("unbindLeave")
      var unbindLeave_Original: UnbindLeaveSignature = js.native
    }
    
    @js.native
    trait JQuery extends StObject {
      
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def arrive(element: String, handlerOrOptions: Options): Unit = js.native
      def arrive(
        element: String,
        handlerOrOptions: Options,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      @JSName("arrive")
      var arrive_Original: ArriveSignature = js.native
      
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction0[/* this */ Element, Unit]
      ): Unit = js.native
      def leave(element: String, handlerOrOptions: Options): Unit = js.native
      def leave(element: String, handlerOrOptions: Options, handler: js.ThisFunction0[/* this */ Element, Unit]): Unit = js.native
      @JSName("leave")
      var leave_Original: LeaveSignature = js.native
      
      def unbindArrive(): Unit = js.native
      def unbindArrive(
        elementOrHandler: js.UndefOr[scala.Nothing],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindArrive(elementOrHandler: String): Unit = js.native
      def unbindArrive(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindArrive(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit = js.native
      def unbindArrive(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      @JSName("unbindArrive")
      var unbindArrive_Original: UnbindArriveSignature = js.native
      
      def unbindLeave(): Unit = js.native
      def unbindLeave(
        elementOrHandler: js.UndefOr[scala.Nothing],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindLeave(elementOrHandler: String): Unit = js.native
      def unbindLeave(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindLeave(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit = js.native
      def unbindLeave(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      @JSName("unbindLeave")
      var unbindLeave_Original: UnbindLeaveSignature = js.native
    }
    
    @js.native
    trait NodeList extends StObject {
      
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def arrive(element: String, handlerOrOptions: Options): Unit = js.native
      def arrive(
        element: String,
        handlerOrOptions: Options,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      @JSName("arrive")
      var arrive_Original: ArriveSignature = js.native
      
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction0[/* this */ Element, Unit]
      ): Unit = js.native
      def leave(element: String, handlerOrOptions: Options): Unit = js.native
      def leave(element: String, handlerOrOptions: Options, handler: js.ThisFunction0[/* this */ Element, Unit]): Unit = js.native
      @JSName("leave")
      var leave_Original: LeaveSignature = js.native
      
      def unbindArrive(): Unit = js.native
      def unbindArrive(
        elementOrHandler: js.UndefOr[scala.Nothing],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindArrive(elementOrHandler: String): Unit = js.native
      def unbindArrive(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindArrive(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit = js.native
      def unbindArrive(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      @JSName("unbindArrive")
      var unbindArrive_Original: UnbindArriveSignature = js.native
      
      def unbindLeave(): Unit = js.native
      def unbindLeave(
        elementOrHandler: js.UndefOr[scala.Nothing],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindLeave(elementOrHandler: String): Unit = js.native
      def unbindLeave(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindLeave(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit = js.native
      def unbindLeave(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      @JSName("unbindLeave")
      var unbindLeave_Original: UnbindLeaveSignature = js.native
    }
    
    @js.native
    trait Window extends StObject {
      
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def arrive(element: String, handlerOrOptions: Options): Unit = js.native
      def arrive(
        element: String,
        handlerOrOptions: Options,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      @JSName("arrive")
      var arrive_Original: ArriveSignature = js.native
      
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction0[/* this */ Element, Unit]
      ): Unit = js.native
      def leave(element: String, handlerOrOptions: Options): Unit = js.native
      def leave(element: String, handlerOrOptions: Options, handler: js.ThisFunction0[/* this */ Element, Unit]): Unit = js.native
      @JSName("leave")
      var leave_Original: LeaveSignature = js.native
      
      def unbindArrive(): Unit = js.native
      def unbindArrive(
        elementOrHandler: js.UndefOr[scala.Nothing],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindArrive(elementOrHandler: String): Unit = js.native
      def unbindArrive(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindArrive(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit = js.native
      def unbindArrive(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      @JSName("unbindArrive")
      var unbindArrive_Original: UnbindArriveSignature = js.native
      
      def unbindLeave(): Unit = js.native
      def unbindLeave(
        elementOrHandler: js.UndefOr[scala.Nothing],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindLeave(elementOrHandler: String): Unit = js.native
      def unbindLeave(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      def unbindLeave(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit = js.native
      def unbindLeave(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit = js.native
      @JSName("unbindLeave")
      var unbindLeave_Original: UnbindLeaveSignature = js.native
    }
  }
  
  type ArriveSignature = js.Function3[
    /* element */ String, 
    /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, 
    /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]], 
    Unit
  ]
  
  type LeaveSignature = js.Function3[
    /* element */ String, 
    /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, 
    /* handler */ js.UndefOr[js.ThisFunction0[/* this */ Element, Unit]], 
    Unit
  ]
  
  @js.native
  trait Options extends StObject {
    
    var existing: js.UndefOr[Boolean] = js.native
    
    var fireOnAttributesModification: js.UndefOr[Boolean] = js.native
    
    var onceOnly: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExisting(value: Boolean): Self = StObject.set(x, "existing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExistingUndefined: Self = StObject.set(x, "existing", js.undefined)
      
      @scala.inline
      def setFireOnAttributesModification(value: Boolean): Self = StObject.set(x, "fireOnAttributesModification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFireOnAttributesModificationUndefined: Self = StObject.set(x, "fireOnAttributesModification", js.undefined)
      
      @scala.inline
      def setOnceOnly(value: Boolean): Self = StObject.set(x, "onceOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnceOnlyUndefined: Self = StObject.set(x, "onceOnly", js.undefined)
    }
  }
  
  type UnbindArriveSignature = js.Function2[
    /* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], 
    /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]], 
    Unit
  ]
  
  type UnbindLeaveSignature = js.Function2[
    /* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], 
    /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]], 
    Unit
  ]
}
