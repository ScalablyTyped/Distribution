package typings.angularScenario

import typings.angular.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularScenario {
  
  type BindingFunction = js.Function1[/* bracketBindingExpression */ String, Future]
  
  @js.native
  trait Browser extends StObject {
    
    def location(): testLocation = js.native
    
    def navigateTo(urlDescription: String, urlFunction: js.Function0[String]): Unit = js.native
    def navigateTo(url: String): Unit = js.native
    
    def reload(): Unit = js.native
    
    def window(): testWindow = js.native
  }
  
  type CustomMatchers = Matchers
  
  @js.native
  trait Element extends StObject {
    
    def attr(key: js.Any): Future = js.native
    def attr(key: js.Any, value: js.Any): Unit = js.native
    
    def click(): js.Any = js.native
    
    def count(): Future = js.native
    
    def css(key: js.Any): Future = js.native
    def css(key: js.Any, value: js.Any): Unit = js.native
    
    def dblclick(): js.Any = js.native
    
    def height(): Future = js.native
    def height(value: js.Any): Unit = js.native
    
    def html(): Future = js.native
    def html(value: js.Any): Unit = js.native
    
    def innerHeight(): Future = js.native
    def innerHeight(value: js.Any): Unit = js.native
    
    def innerWidth(): Future = js.native
    def innerWidth(value: js.Any): Unit = js.native
    
    def mousedown(): js.Any = js.native
    
    def mouseover(): js.Any = js.native
    
    def mouseup(): js.Any = js.native
    
    def offset(): Future = js.native
    def offset(value: js.Any): Unit = js.native
    
    def outerHeight(): Future = js.native
    def outerHeight(value: js.Any): Unit = js.native
    
    def outerWidth(): Future = js.native
    def outerWidth(value: js.Any): Unit = js.native
    
    def position(): Future = js.native
    def position(value: js.Any): Unit = js.native
    
    def prop(key: js.Any): Future = js.native
    def prop(key: js.Any, value: js.Any): Unit = js.native
    
    def query(
      callback: js.Function2[
          /* selectedDOMElements */ JQuery, 
          /* callbackWhenDone */ js.Function2[/* objNull */ js.Any, /* futureValue */ js.Any, _], 
          _
        ]
    ): js.Any = js.native
    
    def scrollLeft(): Future = js.native
    def scrollLeft(value: js.Any): Unit = js.native
    
    def scrollTop(): Future = js.native
    def scrollTop(value: js.Any): Unit = js.native
    
    def text(): Future = js.native
    def text(value: js.Any): Unit = js.native
    
    def `val`(): Future = js.native
    def `val`(value: js.Any): Unit = js.native
    
    def width(): Future = js.native
    def width(value: js.Any): Unit = js.native
  }
  
  @js.native
  trait Expect extends Matchers {
    
    def not(): CustomMatchers = js.native
  }
  object Expect {
    
    @scala.inline
    def apply(
      not: () => CustomMatchers,
      toBe: js.Any => Unit,
      toBeDefined: () => Unit,
      toBeFalsy: () => Unit,
      toBeGreaterThan: js.Any => Unit,
      toBeLessThan: js.Any => Unit,
      toBeNull: () => Unit,
      toBeTruthy: () => Unit,
      toContain: js.Any => Unit,
      toEqual: js.Any => Unit,
      toMatch: js.Any => Unit
    ): Expect = {
      val __obj = js.Dynamic.literal(not = js.Any.fromFunction0(not), toBe = js.Any.fromFunction1(toBe), toBeDefined = js.Any.fromFunction0(toBeDefined), toBeFalsy = js.Any.fromFunction0(toBeFalsy), toBeGreaterThan = js.Any.fromFunction1(toBeGreaterThan), toBeLessThan = js.Any.fromFunction1(toBeLessThan), toBeNull = js.Any.fromFunction0(toBeNull), toBeTruthy = js.Any.fromFunction0(toBeTruthy), toContain = js.Any.fromFunction1(toContain), toEqual = js.Any.fromFunction1(toEqual), toMatch = js.Any.fromFunction1(toMatch))
      __obj.asInstanceOf[Expect]
    }
    
    @scala.inline
    implicit class ExpectMutableBuilder[Self <: Expect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNot(value: () => CustomMatchers): Self = StObject.set(x, "not", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Future extends StObject
  
  @js.native
  trait Input extends StObject {
    
    def check(): js.Any = js.native
    
    def enter(value: js.Any): js.Any = js.native
    
    def select(radioButtonValue: js.Any): js.Any = js.native
    
    def `val`(): Future = js.native
  }
  object Input {
    
    @scala.inline
    def apply(check: () => js.Any, enter: js.Any => js.Any, select: js.Any => js.Any, `val`: () => Future): Input = {
      val __obj = js.Dynamic.literal(check = js.Any.fromFunction0(check), enter = js.Any.fromFunction1(enter), select = js.Any.fromFunction1(select))
      __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
      __obj.asInstanceOf[Input]
    }
    
    @scala.inline
    implicit class InputMutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheck(value: () => js.Any): Self = StObject.set(x, "check", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnter(value: js.Any => js.Any): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelect(value: js.Any => js.Any): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVal(value: () => Future): Self = StObject.set(x, "val", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Matchers extends StObject {
    
    def toBe(value: js.Any): Unit = js.native
    
    def toBeDefined(): Unit = js.native
    
    def toBeFalsy(): Unit = js.native
    
    def toBeGreaterThan(value: js.Any): Unit = js.native
    
    def toBeLessThan(value: js.Any): Unit = js.native
    
    def toBeNull(): Unit = js.native
    
    def toBeTruthy(): Unit = js.native
    
    def toContain(value: js.Any): Unit = js.native
    
    def toEqual(value: js.Any): Unit = js.native
    
    def toMatch(regularExpression: js.Any): Unit = js.native
  }
  object Matchers {
    
    @scala.inline
    def apply(
      toBe: js.Any => Unit,
      toBeDefined: () => Unit,
      toBeFalsy: () => Unit,
      toBeGreaterThan: js.Any => Unit,
      toBeLessThan: js.Any => Unit,
      toBeNull: () => Unit,
      toBeTruthy: () => Unit,
      toContain: js.Any => Unit,
      toEqual: js.Any => Unit,
      toMatch: js.Any => Unit
    ): Matchers = {
      val __obj = js.Dynamic.literal(toBe = js.Any.fromFunction1(toBe), toBeDefined = js.Any.fromFunction0(toBeDefined), toBeFalsy = js.Any.fromFunction0(toBeFalsy), toBeGreaterThan = js.Any.fromFunction1(toBeGreaterThan), toBeLessThan = js.Any.fromFunction1(toBeLessThan), toBeNull = js.Any.fromFunction0(toBeNull), toBeTruthy = js.Any.fromFunction0(toBeTruthy), toContain = js.Any.fromFunction1(toContain), toEqual = js.Any.fromFunction1(toEqual), toMatch = js.Any.fromFunction1(toMatch))
      __obj.asInstanceOf[Matchers]
    }
    
    @scala.inline
    implicit class MatchersMutableBuilder[Self <: Matchers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToBe(value: js.Any => Unit): Self = StObject.set(x, "toBe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToBeDefined(value: () => Unit): Self = StObject.set(x, "toBeDefined", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToBeFalsy(value: () => Unit): Self = StObject.set(x, "toBeFalsy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToBeGreaterThan(value: js.Any => Unit): Self = StObject.set(x, "toBeGreaterThan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToBeLessThan(value: js.Any => Unit): Self = StObject.set(x, "toBeLessThan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToBeNull(value: () => Unit): Self = StObject.set(x, "toBeNull", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToBeTruthy(value: () => Unit): Self = StObject.set(x, "toBeTruthy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToContain(value: js.Any => Unit): Self = StObject.set(x, "toContain", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToEqual(value: js.Any => Unit): Self = StObject.set(x, "toEqual", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToMatch(value: js.Any => Unit): Self = StObject.set(x, "toMatch", js.Any.fromFunction1(value))
    }
  }
  
  type PauseFunction = js.Function0[js.Any]
  
  @js.native
  trait Repeater extends StObject {
    
    def column(ngBindingExpression: String): Future = js.native
    
    def count(): Future = js.native
    
    def row(index: Double): Future = js.native
  }
  object Repeater {
    
    @scala.inline
    def apply(column: String => Future, count: () => Future, row: Double => Future): Repeater = {
      val __obj = js.Dynamic.literal(column = js.Any.fromFunction1(column), count = js.Any.fromFunction0(count), row = js.Any.fromFunction1(row))
      __obj.asInstanceOf[Repeater]
    }
    
    @scala.inline
    implicit class RepeaterMutableBuilder[Self <: Repeater] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: String => Future): Self = StObject.set(x, "column", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCount(value: () => Future): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRow(value: Double => Future): Self = StObject.set(x, "row", js.Any.fromFunction1(value))
    }
  }
  
  type RunFunction = js.Function1[/* functionToRun */ js.Any, js.Any]
  
  type RunFunctionWithDescription = js.Function2[/* description */ String, /* functionToRun */ js.Any, js.Any]
  
  @js.native
  trait Select extends StObject {
    
    def option(listOfValues: js.Any*): js.Any = js.native
    def option(value: js.Any): js.Any = js.native
  }
  
  type SleepFunction = js.Function1[/* seconds */ Double, js.Any]
  
  type UsingFunction = js.Function2[/* selector */ String, /* selectorDescription */ js.UndefOr[String], Unit]
  
  @js.native
  trait testLocation extends StObject {
    
    def hash(): Future = js.native
    
    def path(): Future = js.native
    
    def search(): Future = js.native
    
    def url(): Future = js.native
  }
  object testLocation {
    
    @scala.inline
    def apply(hash: () => Future, path: () => Future, search: () => Future, url: () => Future): testLocation = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction0(hash), path = js.Any.fromFunction0(path), search = js.Any.fromFunction0(search), url = js.Any.fromFunction0(url))
      __obj.asInstanceOf[testLocation]
    }
    
    @scala.inline
    implicit class testLocationMutableBuilder[Self <: testLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: () => Future): Self = StObject.set(x, "hash", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPath(value: () => Future): Self = StObject.set(x, "path", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSearch(value: () => Future): Self = StObject.set(x, "search", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUrl(value: () => Future): Self = StObject.set(x, "url", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait testWindow extends StObject {
    
    def hash(): Future = js.native
    
    def href(): Future = js.native
    
    def path(): Future = js.native
    
    def search(): Future = js.native
  }
  object testWindow {
    
    @scala.inline
    def apply(hash: () => Future, href: () => Future, path: () => Future, search: () => Future): testWindow = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction0(hash), href = js.Any.fromFunction0(href), path = js.Any.fromFunction0(path), search = js.Any.fromFunction0(search))
      __obj.asInstanceOf[testWindow]
    }
    
    @scala.inline
    implicit class testWindowMutableBuilder[Self <: testWindow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: () => Future): Self = StObject.set(x, "hash", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHref(value: () => Future): Self = StObject.set(x, "href", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPath(value: () => Future): Self = StObject.set(x, "path", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSearch(value: () => Future): Self = StObject.set(x, "search", js.Any.fromFunction0(value))
    }
  }
}
