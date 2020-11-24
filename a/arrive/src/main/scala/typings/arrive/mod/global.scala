package typings.arrive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  class Arrive () extends js.Object
  /* static members */
  @js.native
  object Arrive extends js.Object {
    
    def unbindAllArrive(): Unit = js.native
    
    def unbindAllLeave(): Unit = js.native
  }
  
  @js.native
  trait Document extends js.Object {
    
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
  trait Element extends js.Object {
    
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
  trait HTMLCollectionBase extends js.Object {
    
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
  trait JQuery extends js.Object {
    
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
  trait NodeList extends js.Object {
    
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
  trait Window extends js.Object {
    
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
