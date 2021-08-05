package typings.arrive

import typings.arrive.mod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
      inline def unbindAllArrive_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unbindAllArrive")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Arrive.unbindAllLeave")
      @js.native
      def unbindAllLeave: js.Function0[Unit] = js.native
      inline def unbindAllLeave_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unbindAllLeave")(x.asInstanceOf[js.Any])
    }
    
    trait Document extends StObject {
      
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def arrive(element: String, handlerOrOptions: Options): Unit
      def arrive(
        element: String,
        handlerOrOptions: Options,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      @JSName("arrive")
      var arrive_Original: ArriveSignature
      
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction0[/* this */ Element, Unit]
      ): Unit
      def leave(element: String, handlerOrOptions: Options): Unit
      def leave(element: String, handlerOrOptions: Options, handler: js.ThisFunction0[/* this */ Element, Unit]): Unit
      @JSName("leave")
      var leave_Original: LeaveSignature
      
      def unbindArrive(): Unit
      def unbindArrive(elementOrHandler: String): Unit
      def unbindArrive(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindArrive(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      def unbindArrive(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindArrive(elementOrHandler: Unit, handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      @JSName("unbindArrive")
      var unbindArrive_Original: UnbindArriveSignature
      
      def unbindLeave(): Unit
      def unbindLeave(elementOrHandler: String): Unit
      def unbindLeave(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindLeave(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      def unbindLeave(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindLeave(elementOrHandler: Unit, handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      @JSName("unbindLeave")
      var unbindLeave_Original: UnbindLeaveSignature
    }
    object Document {
      
      inline def apply(
        arrive: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit,
        leave: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction0[/* this */ Element, Unit]]) => Unit,
        unbindArrive: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit,
        unbindLeave: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
      ): Document = {
        val __obj = js.Dynamic.literal(arrive = js.Any.fromFunction3(arrive), leave = js.Any.fromFunction3(leave), unbindArrive = js.Any.fromFunction2(unbindArrive), unbindLeave = js.Any.fromFunction2(unbindLeave))
        __obj.asInstanceOf[Document]
      }
      
      extension [Self <: Document](x: Self) {
        
        inline def setArrive(
          value: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "arrive", js.Any.fromFunction3(value))
        
        inline def setLeave(
          value: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction0[/* this */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "leave", js.Any.fromFunction3(value))
        
        inline def setUnbindArrive(
          value: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "unbindArrive", js.Any.fromFunction2(value))
        
        inline def setUnbindLeave(
          value: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "unbindLeave", js.Any.fromFunction2(value))
      }
    }
    
    trait Element extends StObject {
      
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def arrive(element: String, handlerOrOptions: Options): Unit
      def arrive(
        element: String,
        handlerOrOptions: Options,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      @JSName("arrive")
      var arrive_Original: ArriveSignature
      
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction0[/* this */ Element, Unit]
      ): Unit
      def leave(element: String, handlerOrOptions: Options): Unit
      def leave(element: String, handlerOrOptions: Options, handler: js.ThisFunction0[/* this */ Element, Unit]): Unit
      @JSName("leave")
      var leave_Original: LeaveSignature
      
      def unbindArrive(): Unit
      def unbindArrive(elementOrHandler: String): Unit
      def unbindArrive(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindArrive(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      def unbindArrive(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindArrive(elementOrHandler: Unit, handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      @JSName("unbindArrive")
      var unbindArrive_Original: UnbindArriveSignature
      
      def unbindLeave(): Unit
      def unbindLeave(elementOrHandler: String): Unit
      def unbindLeave(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindLeave(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      def unbindLeave(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindLeave(elementOrHandler: Unit, handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      @JSName("unbindLeave")
      var unbindLeave_Original: UnbindLeaveSignature
    }
    object Element {
      
      inline def apply(
        arrive: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit,
        leave: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction0[/* this */ Element, Unit]]) => Unit,
        unbindArrive: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit,
        unbindLeave: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
      ): Element = {
        val __obj = js.Dynamic.literal(arrive = js.Any.fromFunction3(arrive), leave = js.Any.fromFunction3(leave), unbindArrive = js.Any.fromFunction2(unbindArrive), unbindLeave = js.Any.fromFunction2(unbindLeave))
        __obj.asInstanceOf[Element]
      }
      
      extension [Self <: Element](x: Self) {
        
        inline def setArrive(
          value: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "arrive", js.Any.fromFunction3(value))
        
        inline def setLeave(
          value: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction0[/* this */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "leave", js.Any.fromFunction3(value))
        
        inline def setUnbindArrive(
          value: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "unbindArrive", js.Any.fromFunction2(value))
        
        inline def setUnbindLeave(
          value: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "unbindLeave", js.Any.fromFunction2(value))
      }
    }
    
    trait HTMLCollectionBase extends StObject {
      
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def arrive(element: String, handlerOrOptions: Options): Unit
      def arrive(
        element: String,
        handlerOrOptions: Options,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      @JSName("arrive")
      var arrive_Original: ArriveSignature
      
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction0[/* this */ Element, Unit]
      ): Unit
      def leave(element: String, handlerOrOptions: Options): Unit
      def leave(element: String, handlerOrOptions: Options, handler: js.ThisFunction0[/* this */ Element, Unit]): Unit
      @JSName("leave")
      var leave_Original: LeaveSignature
      
      def unbindArrive(): Unit
      def unbindArrive(elementOrHandler: String): Unit
      def unbindArrive(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindArrive(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      def unbindArrive(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindArrive(elementOrHandler: Unit, handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      @JSName("unbindArrive")
      var unbindArrive_Original: UnbindArriveSignature
      
      def unbindLeave(): Unit
      def unbindLeave(elementOrHandler: String): Unit
      def unbindLeave(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindLeave(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      def unbindLeave(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindLeave(elementOrHandler: Unit, handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      @JSName("unbindLeave")
      var unbindLeave_Original: UnbindLeaveSignature
    }
    object HTMLCollectionBase {
      
      inline def apply(
        arrive: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit,
        leave: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction0[/* this */ Element, Unit]]) => Unit,
        unbindArrive: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit,
        unbindLeave: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
      ): HTMLCollectionBase = {
        val __obj = js.Dynamic.literal(arrive = js.Any.fromFunction3(arrive), leave = js.Any.fromFunction3(leave), unbindArrive = js.Any.fromFunction2(unbindArrive), unbindLeave = js.Any.fromFunction2(unbindLeave))
        __obj.asInstanceOf[HTMLCollectionBase]
      }
      
      extension [Self <: HTMLCollectionBase](x: Self) {
        
        inline def setArrive(
          value: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "arrive", js.Any.fromFunction3(value))
        
        inline def setLeave(
          value: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction0[/* this */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "leave", js.Any.fromFunction3(value))
        
        inline def setUnbindArrive(
          value: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "unbindArrive", js.Any.fromFunction2(value))
        
        inline def setUnbindLeave(
          value: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "unbindLeave", js.Any.fromFunction2(value))
      }
    }
    
    trait JQuery extends StObject {
      
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def arrive(element: String, handlerOrOptions: Options): Unit
      def arrive(
        element: String,
        handlerOrOptions: Options,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      @JSName("arrive")
      var arrive_Original: ArriveSignature
      
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction0[/* this */ Element, Unit]
      ): Unit
      def leave(element: String, handlerOrOptions: Options): Unit
      def leave(element: String, handlerOrOptions: Options, handler: js.ThisFunction0[/* this */ Element, Unit]): Unit
      @JSName("leave")
      var leave_Original: LeaveSignature
      
      def unbindArrive(): Unit
      def unbindArrive(elementOrHandler: String): Unit
      def unbindArrive(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindArrive(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      def unbindArrive(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindArrive(elementOrHandler: Unit, handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      @JSName("unbindArrive")
      var unbindArrive_Original: UnbindArriveSignature
      
      def unbindLeave(): Unit
      def unbindLeave(elementOrHandler: String): Unit
      def unbindLeave(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindLeave(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      def unbindLeave(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindLeave(elementOrHandler: Unit, handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      @JSName("unbindLeave")
      var unbindLeave_Original: UnbindLeaveSignature
    }
    object JQuery {
      
      inline def apply(
        arrive: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit,
        leave: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction0[/* this */ Element, Unit]]) => Unit,
        unbindArrive: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit,
        unbindLeave: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
      ): JQuery = {
        val __obj = js.Dynamic.literal(arrive = js.Any.fromFunction3(arrive), leave = js.Any.fromFunction3(leave), unbindArrive = js.Any.fromFunction2(unbindArrive), unbindLeave = js.Any.fromFunction2(unbindLeave))
        __obj.asInstanceOf[JQuery]
      }
      
      extension [Self <: JQuery](x: Self) {
        
        inline def setArrive(
          value: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "arrive", js.Any.fromFunction3(value))
        
        inline def setLeave(
          value: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction0[/* this */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "leave", js.Any.fromFunction3(value))
        
        inline def setUnbindArrive(
          value: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "unbindArrive", js.Any.fromFunction2(value))
        
        inline def setUnbindLeave(
          value: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "unbindLeave", js.Any.fromFunction2(value))
      }
    }
    
    trait NodeList extends StObject {
      
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def arrive(element: String, handlerOrOptions: Options): Unit
      def arrive(
        element: String,
        handlerOrOptions: Options,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      @JSName("arrive")
      var arrive_Original: ArriveSignature
      
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction0[/* this */ Element, Unit]
      ): Unit
      def leave(element: String, handlerOrOptions: Options): Unit
      def leave(element: String, handlerOrOptions: Options, handler: js.ThisFunction0[/* this */ Element, Unit]): Unit
      @JSName("leave")
      var leave_Original: LeaveSignature
      
      def unbindArrive(): Unit
      def unbindArrive(elementOrHandler: String): Unit
      def unbindArrive(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindArrive(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      def unbindArrive(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindArrive(elementOrHandler: Unit, handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      @JSName("unbindArrive")
      var unbindArrive_Original: UnbindArriveSignature
      
      def unbindLeave(): Unit
      def unbindLeave(elementOrHandler: String): Unit
      def unbindLeave(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindLeave(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      def unbindLeave(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindLeave(elementOrHandler: Unit, handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      @JSName("unbindLeave")
      var unbindLeave_Original: UnbindLeaveSignature
    }
    object NodeList {
      
      inline def apply(
        arrive: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit,
        leave: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction0[/* this */ Element, Unit]]) => Unit,
        unbindArrive: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit,
        unbindLeave: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
      ): NodeList = {
        val __obj = js.Dynamic.literal(arrive = js.Any.fromFunction3(arrive), leave = js.Any.fromFunction3(leave), unbindArrive = js.Any.fromFunction2(unbindArrive), unbindLeave = js.Any.fromFunction2(unbindLeave))
        __obj.asInstanceOf[NodeList]
      }
      
      extension [Self <: NodeList](x: Self) {
        
        inline def setArrive(
          value: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "arrive", js.Any.fromFunction3(value))
        
        inline def setLeave(
          value: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction0[/* this */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "leave", js.Any.fromFunction3(value))
        
        inline def setUnbindArrive(
          value: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "unbindArrive", js.Any.fromFunction2(value))
        
        inline def setUnbindLeave(
          value: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "unbindLeave", js.Any.fromFunction2(value))
      }
    }
    
    trait Window extends StObject {
      
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def arrive(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def arrive(element: String, handlerOrOptions: Options): Unit
      def arrive(
        element: String,
        handlerOrOptions: Options,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      @JSName("arrive")
      var arrive_Original: ArriveSignature
      
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def leave(
        element: String,
        handlerOrOptions: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction0[/* this */ Element, Unit]
      ): Unit
      def leave(element: String, handlerOrOptions: Options): Unit
      def leave(element: String, handlerOrOptions: Options, handler: js.ThisFunction0[/* this */ Element, Unit]): Unit
      @JSName("leave")
      var leave_Original: LeaveSignature
      
      def unbindArrive(): Unit
      def unbindArrive(elementOrHandler: String): Unit
      def unbindArrive(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindArrive(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      def unbindArrive(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindArrive(elementOrHandler: Unit, handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      @JSName("unbindArrive")
      var unbindArrive_Original: UnbindArriveSignature
      
      def unbindLeave(): Unit
      def unbindLeave(elementOrHandler: String): Unit
      def unbindLeave(
        elementOrHandler: String,
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindLeave(elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      def unbindLeave(
        elementOrHandler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit],
        handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]
      ): Unit
      def unbindLeave(elementOrHandler: Unit, handler: js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]): Unit
      @JSName("unbindLeave")
      var unbindLeave_Original: UnbindLeaveSignature
    }
    object Window {
      
      inline def apply(
        arrive: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit,
        leave: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction0[/* this */ Element, Unit]]) => Unit,
        unbindArrive: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit,
        unbindLeave: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
      ): Window = {
        val __obj = js.Dynamic.literal(arrive = js.Any.fromFunction3(arrive), leave = js.Any.fromFunction3(leave), unbindArrive = js.Any.fromFunction2(unbindArrive), unbindLeave = js.Any.fromFunction2(unbindLeave))
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setArrive(
          value: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "arrive", js.Any.fromFunction3(value))
        
        inline def setLeave(
          value: (/* element */ String, /* handlerOrOptions */ (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]) | Options, /* handler */ js.UndefOr[js.ThisFunction0[/* this */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "leave", js.Any.fromFunction3(value))
        
        inline def setUnbindArrive(
          value: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "unbindArrive", js.Any.fromFunction2(value))
        
        inline def setUnbindLeave(
          value: (/* elementOrHandler */ js.UndefOr[String | (js.ThisFunction1[/* this */ Element, /* element */ Element, Unit])], /* handler */ js.UndefOr[js.ThisFunction1[/* this */ Element, /* element */ Element, Unit]]) => Unit
        ): Self = StObject.set(x, "unbindLeave", js.Any.fromFunction2(value))
      }
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
  
  trait Options extends StObject {
    
    var existing: js.UndefOr[Boolean] = js.undefined
    
    var fireOnAttributesModification: js.UndefOr[Boolean] = js.undefined
    
    var onceOnly: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExisting(value: Boolean): Self = StObject.set(x, "existing", value.asInstanceOf[js.Any])
      
      inline def setExistingUndefined: Self = StObject.set(x, "existing", js.undefined)
      
      inline def setFireOnAttributesModification(value: Boolean): Self = StObject.set(x, "fireOnAttributesModification", value.asInstanceOf[js.Any])
      
      inline def setFireOnAttributesModificationUndefined: Self = StObject.set(x, "fireOnAttributesModification", js.undefined)
      
      inline def setOnceOnly(value: Boolean): Self = StObject.set(x, "onceOnly", value.asInstanceOf[js.Any])
      
      inline def setOnceOnlyUndefined: Self = StObject.set(x, "onceOnly", js.undefined)
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
