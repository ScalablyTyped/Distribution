package typings.angularScenario

import typings.angular.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    def attr(key: Any): Future = js.native
    def attr(key: Any, value: Any): Unit = js.native
    
    def click(): Any = js.native
    
    def count(): Future = js.native
    
    def css(key: Any): Future = js.native
    def css(key: Any, value: Any): Unit = js.native
    
    def dblclick(): Any = js.native
    
    def height(): Future = js.native
    def height(value: Any): Unit = js.native
    
    def html(): Future = js.native
    def html(value: Any): Unit = js.native
    
    def innerHeight(): Future = js.native
    def innerHeight(value: Any): Unit = js.native
    
    def innerWidth(): Future = js.native
    def innerWidth(value: Any): Unit = js.native
    
    def mousedown(): Any = js.native
    
    def mouseover(): Any = js.native
    
    def mouseup(): Any = js.native
    
    def offset(): Future = js.native
    def offset(value: Any): Unit = js.native
    
    def outerHeight(): Future = js.native
    def outerHeight(value: Any): Unit = js.native
    
    def outerWidth(): Future = js.native
    def outerWidth(value: Any): Unit = js.native
    
    def position(): Future = js.native
    def position(value: Any): Unit = js.native
    
    def prop(key: Any): Future = js.native
    def prop(key: Any, value: Any): Unit = js.native
    
    def query(
      callback: js.Function2[
          /* selectedDOMElements */ JQuery, 
          /* callbackWhenDone */ js.Function2[/* objNull */ Any, /* futureValue */ Any, Any], 
          Any
        ]
    ): Any = js.native
    
    def scrollLeft(): Future = js.native
    def scrollLeft(value: Any): Unit = js.native
    
    def scrollTop(): Future = js.native
    def scrollTop(value: Any): Unit = js.native
    
    def text(): Future = js.native
    def text(value: Any): Unit = js.native
    
    def `val`(): Future = js.native
    def `val`(value: Any): Unit = js.native
    
    def width(): Future = js.native
    def width(value: Any): Unit = js.native
  }
  
  trait Expect
    extends StObject
       with Matchers {
    
    def not(): CustomMatchers
  }
  object Expect {
    
    inline def apply(
      not: () => CustomMatchers,
      toBe: Any => Unit,
      toBeDefined: () => Unit,
      toBeFalsy: () => Unit,
      toBeGreaterThan: Any => Unit,
      toBeLessThan: Any => Unit,
      toBeNull: () => Unit,
      toBeTruthy: () => Unit,
      toContain: Any => Unit,
      toEqual: Any => Unit,
      toMatch: Any => Unit
    ): Expect = {
      val __obj = js.Dynamic.literal(not = js.Any.fromFunction0(not), toBe = js.Any.fromFunction1(toBe), toBeDefined = js.Any.fromFunction0(toBeDefined), toBeFalsy = js.Any.fromFunction0(toBeFalsy), toBeGreaterThan = js.Any.fromFunction1(toBeGreaterThan), toBeLessThan = js.Any.fromFunction1(toBeLessThan), toBeNull = js.Any.fromFunction0(toBeNull), toBeTruthy = js.Any.fromFunction0(toBeTruthy), toContain = js.Any.fromFunction1(toContain), toEqual = js.Any.fromFunction1(toEqual), toMatch = js.Any.fromFunction1(toMatch))
      __obj.asInstanceOf[Expect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Expect] (val x: Self) extends AnyVal {
      
      inline def setNot(value: () => CustomMatchers): Self = StObject.set(x, "not", js.Any.fromFunction0(value))
    }
  }
  
  trait Future extends StObject
  
  trait Input extends StObject {
    
    def check(): Any
    
    def enter(value: Any): Any
    
    def select(radioButtonValue: Any): Any
    
    def `val`(): Future
  }
  object Input {
    
    inline def apply(check: () => Any, enter: Any => Any, select: Any => Any, `val`: () => Future): Input = {
      val __obj = js.Dynamic.literal(check = js.Any.fromFunction0(check), enter = js.Any.fromFunction1(enter), select = js.Any.fromFunction1(select))
      __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
      __obj.asInstanceOf[Input]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
      
      inline def setCheck(value: () => Any): Self = StObject.set(x, "check", js.Any.fromFunction0(value))
      
      inline def setEnter(value: Any => Any): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
      
      inline def setSelect(value: Any => Any): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setVal(value: () => Future): Self = StObject.set(x, "val", js.Any.fromFunction0(value))
    }
  }
  
  trait Matchers extends StObject {
    
    def toBe(value: Any): Unit
    
    def toBeDefined(): Unit
    
    def toBeFalsy(): Unit
    
    def toBeGreaterThan(value: Any): Unit
    
    def toBeLessThan(value: Any): Unit
    
    def toBeNull(): Unit
    
    def toBeTruthy(): Unit
    
    def toContain(value: Any): Unit
    
    def toEqual(value: Any): Unit
    
    def toMatch(regularExpression: Any): Unit
  }
  object Matchers {
    
    inline def apply(
      toBe: Any => Unit,
      toBeDefined: () => Unit,
      toBeFalsy: () => Unit,
      toBeGreaterThan: Any => Unit,
      toBeLessThan: Any => Unit,
      toBeNull: () => Unit,
      toBeTruthy: () => Unit,
      toContain: Any => Unit,
      toEqual: Any => Unit,
      toMatch: Any => Unit
    ): Matchers = {
      val __obj = js.Dynamic.literal(toBe = js.Any.fromFunction1(toBe), toBeDefined = js.Any.fromFunction0(toBeDefined), toBeFalsy = js.Any.fromFunction0(toBeFalsy), toBeGreaterThan = js.Any.fromFunction1(toBeGreaterThan), toBeLessThan = js.Any.fromFunction1(toBeLessThan), toBeNull = js.Any.fromFunction0(toBeNull), toBeTruthy = js.Any.fromFunction0(toBeTruthy), toContain = js.Any.fromFunction1(toContain), toEqual = js.Any.fromFunction1(toEqual), toMatch = js.Any.fromFunction1(toMatch))
      __obj.asInstanceOf[Matchers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Matchers] (val x: Self) extends AnyVal {
      
      inline def setToBe(value: Any => Unit): Self = StObject.set(x, "toBe", js.Any.fromFunction1(value))
      
      inline def setToBeDefined(value: () => Unit): Self = StObject.set(x, "toBeDefined", js.Any.fromFunction0(value))
      
      inline def setToBeFalsy(value: () => Unit): Self = StObject.set(x, "toBeFalsy", js.Any.fromFunction0(value))
      
      inline def setToBeGreaterThan(value: Any => Unit): Self = StObject.set(x, "toBeGreaterThan", js.Any.fromFunction1(value))
      
      inline def setToBeLessThan(value: Any => Unit): Self = StObject.set(x, "toBeLessThan", js.Any.fromFunction1(value))
      
      inline def setToBeNull(value: () => Unit): Self = StObject.set(x, "toBeNull", js.Any.fromFunction0(value))
      
      inline def setToBeTruthy(value: () => Unit): Self = StObject.set(x, "toBeTruthy", js.Any.fromFunction0(value))
      
      inline def setToContain(value: Any => Unit): Self = StObject.set(x, "toContain", js.Any.fromFunction1(value))
      
      inline def setToEqual(value: Any => Unit): Self = StObject.set(x, "toEqual", js.Any.fromFunction1(value))
      
      inline def setToMatch(value: Any => Unit): Self = StObject.set(x, "toMatch", js.Any.fromFunction1(value))
    }
  }
  
  type PauseFunction = js.Function0[Any]
  
  trait Repeater extends StObject {
    
    def column(ngBindingExpression: String): Future
    
    def count(): Future
    
    def row(index: Double): Future
  }
  object Repeater {
    
    inline def apply(column: String => Future, count: () => Future, row: Double => Future): Repeater = {
      val __obj = js.Dynamic.literal(column = js.Any.fromFunction1(column), count = js.Any.fromFunction0(count), row = js.Any.fromFunction1(row))
      __obj.asInstanceOf[Repeater]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Repeater] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: String => Future): Self = StObject.set(x, "column", js.Any.fromFunction1(value))
      
      inline def setCount(value: () => Future): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
      
      inline def setRow(value: Double => Future): Self = StObject.set(x, "row", js.Any.fromFunction1(value))
    }
  }
  
  type RunFunction = js.Function1[/* functionToRun */ Any, Any]
  
  type RunFunctionWithDescription = js.Function2[/* description */ String, /* functionToRun */ Any, Any]
  
  @js.native
  trait Select extends StObject {
    
    def option(listOfValues: Any*): Any = js.native
    def option(value: Any): Any = js.native
  }
  
  type SleepFunction = js.Function1[/* seconds */ Double, Any]
  
  type UsingFunction = js.Function2[/* selector */ String, /* selectorDescription */ js.UndefOr[String], Unit]
  
  trait testLocation extends StObject {
    
    def hash(): Future
    
    def path(): Future
    
    def search(): Future
    
    def url(): Future
  }
  object testLocation {
    
    inline def apply(hash: () => Future, path: () => Future, search: () => Future, url: () => Future): testLocation = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction0(hash), path = js.Any.fromFunction0(path), search = js.Any.fromFunction0(search), url = js.Any.fromFunction0(url))
      __obj.asInstanceOf[testLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: testLocation] (val x: Self) extends AnyVal {
      
      inline def setHash(value: () => Future): Self = StObject.set(x, "hash", js.Any.fromFunction0(value))
      
      inline def setPath(value: () => Future): Self = StObject.set(x, "path", js.Any.fromFunction0(value))
      
      inline def setSearch(value: () => Future): Self = StObject.set(x, "search", js.Any.fromFunction0(value))
      
      inline def setUrl(value: () => Future): Self = StObject.set(x, "url", js.Any.fromFunction0(value))
    }
  }
  
  trait testWindow extends StObject {
    
    def hash(): Future
    
    def href(): Future
    
    def path(): Future
    
    def search(): Future
  }
  object testWindow {
    
    inline def apply(hash: () => Future, href: () => Future, path: () => Future, search: () => Future): testWindow = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction0(hash), href = js.Any.fromFunction0(href), path = js.Any.fromFunction0(path), search = js.Any.fromFunction0(search))
      __obj.asInstanceOf[testWindow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: testWindow] (val x: Self) extends AnyVal {
      
      inline def setHash(value: () => Future): Self = StObject.set(x, "hash", js.Any.fromFunction0(value))
      
      inline def setHref(value: () => Future): Self = StObject.set(x, "href", js.Any.fromFunction0(value))
      
      inline def setPath(value: () => Future): Self = StObject.set(x, "path", js.Any.fromFunction0(value))
      
      inline def setSearch(value: () => Future): Self = StObject.set(x, "search", js.Any.fromFunction0(value))
    }
  }
}
