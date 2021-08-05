package typings.agGrid.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Event
import typings.std.EventListener
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.NamedNodeMap
import typings.std.Node
import typings.std.NodeList
import typings.std.Touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("ag-grid", "_")
@js.native
class _underscore ()
  extends typings.agGrid.utilsMod.Utils
object _underscore {
  
  @JSImport("ag-grid", "_")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ag-grid", "_.NUMPAD_DEL_NUMLOCK_ON_CHARCODE")
  @js.native
  def NUMPAD_DEL_NUMLOCK_ON_CHARCODE: js.Any = js.native
  inline def NUMPAD_DEL_NUMLOCK_ON_CHARCODE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD_DEL_NUMLOCK_ON_CHARCODE")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "_.NUMPAD_DEL_NUMLOCK_ON_KEY")
  @js.native
  def NUMPAD_DEL_NUMLOCK_ON_KEY: js.Any = js.native
  inline def NUMPAD_DEL_NUMLOCK_ON_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD_DEL_NUMLOCK_ON_KEY")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "_.PRINTABLE_CHARACTERS")
  @js.native
  def PRINTABLE_CHARACTERS: js.Any = js.native
  inline def PRINTABLE_CHARACTERS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRINTABLE_CHARACTERS")(x.asInstanceOf[js.Any])
  
  inline def addAgGridEventPath(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAgGridEventPath")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addChangeListener(element: HTMLElement, listener: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addChangeListener")(element.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addCssClass(element: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCssClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addOrRemoveCssClass(element: HTMLElement, className: String, addOrRemove: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addOrRemoveCssClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], addOrRemove.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addSafePassiveEventListener(eElement: HTMLElement, event: String, listener: js.Function1[/* event */ js.UndefOr[js.Any], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSafePassiveEventListener")(eElement.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addStylesToElement(eElement: js.Any, styles: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addStylesToElement")(eElement.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def anyExists(values: js.Array[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("anyExists")(values.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def appendHtml(eContainer: HTMLElement, htmlTemplate: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendHtml")(eContainer.asInstanceOf[js.Any], htmlTemplate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def areEventsNear(e1: MouseEvent, e2: MouseEvent, pixelCount: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areEventsNear")(e1.asInstanceOf[js.Any], e2.asInstanceOf[js.Any], pixelCount.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def areEventsNear(e1: MouseEvent, e2: Touch, pixelCount: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areEventsNear")(e1.asInstanceOf[js.Any], e2.asInstanceOf[js.Any], pixelCount.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def areEventsNear(e1: Touch, e2: MouseEvent, pixelCount: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areEventsNear")(e1.asInstanceOf[js.Any], e2.asInstanceOf[js.Any], pixelCount.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def areEventsNear(e1: Touch, e2: Touch, pixelCount: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areEventsNear")(e1.asInstanceOf[js.Any], e2.asInstanceOf[js.Any], pixelCount.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def assign(`object`: js.Any, sources: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(`object`.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def callIfPresent(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callIfPresent")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def camelCaseToHumanText(camelCase: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCaseToHumanText")(camelCase.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def camelCaseToHyphen(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCaseToHyphen")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cleanNumber(value: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def cloneObject[T](`object`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def compareArrays(array1: js.Array[js.Any], array2: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareArrays")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def containsClass(element: js.Any, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def copyNodeList(nodeList: NodeList): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyNodeList")(nodeList.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
  
  inline def createArrayOfNumbers(first: Double, last: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("createArrayOfNumbers")(first.asInstanceOf[js.Any], last.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def createEventPath(event: Event): js.Array[EventTarget] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEventPath")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[EventTarget]]
  
  /**
    * If icon provided, use this (either a string, or a function callback).
    * if not, then use the default icon from the theme
    */
  inline def createIcon(
    iconName: String,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column
  ): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createIcon")(iconName.asInstanceOf[js.Any], gridOptionsWrapper.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def createIconNoSpan(
    iconName: String,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column
  ): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createIconNoSpan")(iconName.asInstanceOf[js.Any], gridOptionsWrapper.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def cssStyleObjectToMarkup(stylesToUse: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cssStyleObjectToMarkup")(stylesToUse.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * https://stackoverflow.com/questions/24004791/can-someone-explain-the-debounce-function-in-javascript
    */
  inline def debounce(func: js.Function0[Unit], wait: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def debounce(func: js.Function0[Unit], wait: Double, immediate: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def defaultComparator(valueA: js.Any, valueB: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultComparator")(valueA.asInstanceOf[js.Any], valueB.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defaultComparator(valueA: js.Any, valueB: js.Any, accentedCompare: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultComparator")(valueA.asInstanceOf[js.Any], valueB.asInstanceOf[js.Any], accentedCompare.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def doOnce(func: js.Function0[Unit], key: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doOnce")(func.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("ag-grid", "_.doOnceFlags")
  @js.native
  def doOnceFlags: js.Any = js.native
  inline def doOnceFlags_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("doOnceFlags")(x.asInstanceOf[js.Any])
  
  inline def ensureDomOrder(eContainer: HTMLElement, eChild: HTMLElement, eChildBefore: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDomOrder")(eContainer.asInstanceOf[js.Any], eChild.asInstanceOf[js.Any], eChildBefore.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def escape(toEscape: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(toEscape.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def every[T](items: js.Array[T], callback: js.Function1[/* item */ T, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(items.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def executeAfter(funcs: js.Array[js.Function], millis: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAfter")(funcs.asInstanceOf[js.Any], millis.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def executeInAWhile(funcs: js.Array[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("executeInAWhile")(funcs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def executeNextVMTurn(funcs: js.Array[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("executeNextVMTurn")(funcs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def exists(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def existsAndNotEmpty(value: js.Array[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("existsAndNotEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def filter[T](array: js.Array[T], callback: js.Function1[/* item */ T, Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def find[T](collection: js.Array[T], predicate: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def find[T](collection: js.Array[T], predicate: String, value: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def find[T](collection: js.Array[T], predicate: js.Function1[/* item */ T, Unit]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def find[T](collection: js.Array[T], predicate: js.Function1[/* item */ T, Unit], value: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def find[T](collection: js.Array[T], predicate: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def find[T](collection: js.Array[T], predicate: Boolean, value: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def find[T](collection: StringDictionary[T], predicate: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def find[T](collection: StringDictionary[T], predicate: String, value: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def find[T](collection: StringDictionary[T], predicate: js.Function1[/* item */ T, Unit]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def find[T](collection: StringDictionary[T], predicate: js.Function1[/* item */ T, Unit], value: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def find[T](collection: StringDictionary[T], predicate: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def find[T](collection: StringDictionary[T], predicate: Boolean, value: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def firstExistingValue[A](values: A*): A = ^.asInstanceOf[js.Dynamic].applyDynamic("firstExistingValue")(values.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def forEach[T](array: js.Array[T], callback: js.Function2[/* item */ T, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forEachSnapshotFirst(list: js.Array[js.Any], callback: js.Function1[/* item */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachSnapshotFirst")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def formatNumberCommas(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatNumberCommas")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatNumberTwoDecimalPlacesAndCommas(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatNumberTwoDecimalPlacesAndCommas")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatWidth(width: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatWidth")(width.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatWidth(width: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatWidth")(width.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fuzzyCheckStrings(inputValues: js.Array[String], validValues: js.Array[String], allSuggestions: js.Array[String]): StringDictionary[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fuzzyCheckStrings")(inputValues.asInstanceOf[js.Any], validValues.asInstanceOf[js.Any], allSuggestions.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[String]]]
  
  inline def fuzzySuggestions(inputValue: String, validValues: js.Array[String], allSuggestions: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("fuzzySuggestions")(inputValue.asInstanceOf[js.Any], validValues.asInstanceOf[js.Any], allSuggestions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def get(source: StringDictionary[js.Any], expression: String, defaultValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(source.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getAllKeysInObjects(objects: js.Array[js.Any]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllKeysInObjects")(objects.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getBigrams(from: String): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get_bigrams")(from.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def getBodyHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBodyHeight")().asInstanceOf[Double]
  
  inline def getBodyWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBodyWidth")().asInstanceOf[Double]
  
  inline def getElementAttribute(element: js.Any, attributeName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementAttribute")(element.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getEventPath(event: Event): js.Array[EventTarget] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventPath")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[EventTarget]]
  
  inline def getFunctionParameters(func: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionParameters")(func.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getMaxDivHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxDivHeight")().asInstanceOf[Double]
  
  inline def getNameOfClass(TheClass: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameOfClass")(TheClass.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getScrollLeft(element: HTMLElement, rtl: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollLeft")(element.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getScrollbarWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollbarWidth")().asInstanceOf[Double]
  
  inline def getTarget(event: Event): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("getTarget")(event.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getValueUsingField(data: js.Any, field: String, fieldContainsDots: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueUsingField")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any], fieldContainsDots.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def hyphenToCamelCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hyphenToCamelCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def insertArrayIntoArray[T](dest: js.Array[T], src: js.Array[T], toIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertArrayIntoArray")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any], toIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def insertIntoArray[T](array: js.Array[T], `object`: T, toIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertIntoArray")(array.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], toIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def insertTemplateWithDomOrder(eContainer: HTMLElement, htmlTemplate: String, eChildBefore: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("insertTemplateWithDomOrder")(eContainer.asInstanceOf[js.Any], htmlTemplate.asInstanceOf[js.Any], eChildBefore.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def insertWithDomOrder(eContainer: HTMLElement, eChild: HTMLElement, eChildBefore: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertWithDomOrder")(eContainer.asInstanceOf[js.Any], eChild.asInstanceOf[js.Any], eChildBefore.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isBrowserChrome(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowserChrome")().asInstanceOf[Boolean]
  
  inline def isBrowserEdge(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowserEdge")().asInstanceOf[Boolean]
  
  inline def isBrowserFirefox(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowserFirefox")().asInstanceOf[Boolean]
  
  inline def isBrowserIE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowserIE")().asInstanceOf[Boolean]
  
  inline def isBrowserSafari(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowserSafari")().asInstanceOf[Boolean]
  
  @JSImport("ag-grid", "_.isChrome")
  @js.native
  def isChrome: js.Any = js.native
  inline def isChrome_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isChrome")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "_.isEdge")
  @js.native
  def isEdge: js.Any = js.native
  inline def isEdge_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isEdge")(x.asInstanceOf[js.Any])
  
  inline def isElement(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isElementInEventPath(element: HTMLElement, event: Event): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isElementInEventPath")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEventFromPrintableCharacter(event: KeyboardEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEventFromPrintableCharacter")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("ag-grid", "_.isFirefox")
  @js.native
  def isFirefox: js.Any = js.native
  inline def isFirefox_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFirefox")(x.asInstanceOf[js.Any])
  
  inline def isHorizontalScrollShowing(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHorizontalScrollShowing")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("ag-grid", "_.isIE")
  @js.native
  def isIE: js.Any = js.native
  inline def isIE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isIE")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "_.isIPad")
  @js.native
  def isIPad: js.Any = js.native
  inline def isIPad_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isIPad")(x.asInstanceOf[js.Any])
  
  inline def isKeyPressed(event: KeyboardEvent, keyToCheck: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isKeyPressed")(event.asInstanceOf[js.Any], keyToCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNode(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNodeOrElement(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeOrElement")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * From http://stackoverflow.com/questions/9716468/is-there-any-function-like-isnumeric-in-javascript-to-validate-numbers
    */
  inline def isNumeric(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumpadDelWithNumlockOnForEdgeOrIe(event: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumpadDelWithNumlockOnForEdgeOrIe")(event.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("ag-grid", "_.isSafari")
  @js.native
  def isSafari: js.Any = js.native
  inline def isSafari_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSafari")(x.asInstanceOf[js.Any])
  
  inline def isStopPropagationForAgGrid(event: Event): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStopPropagationForAgGrid")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUserAgentIPad(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUserAgentIPad")().asInstanceOf[Boolean]
  
  inline def isVerticalScrollShowing(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVerticalScrollShowing")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isVisible(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def iterateArray[T](array: js.Array[T], callback: js.Function2[/* item */ T, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateArray")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def iterateNamedNodeMap(map: NamedNodeMap, callback: js.Function2[/* key */ String, /* value */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateNamedNodeMap")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def iterateObject[T](`object`: js.Array[T], callback: js.Function2[/* key */ String, /* value */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateObject")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def iterateObject[T](`object`: StringDictionary[T], callback: js.Function2[/* key */ String, /* value */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateObject")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * loads the template and returns it as an element. makes up for no simple way in
    * the dom api to load html directly, eg we cannot do this: document.createElement(template)
    */
  inline def loadTemplate(template: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  inline def makeNull[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNull")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def map[TItem, TResult](array: js.Array[TItem], callback: js.Function1[/* item */ TItem, TResult]): js.Array[TResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[TResult]]
  
  inline def mapObject[TResult](`object`: js.Any, callback: js.Function1[/* item */ js.Any, TResult]): js.Array[TResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapObject")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[TResult]]
  
  inline def mergeDeep(dest: js.Any, source: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDeep")(dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def message(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("message")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def missing(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("missing")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def missingOrEmpty(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("missingOrEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def missingOrEmpty(value: js.Array[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("missingOrEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def missingOrEmptyObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("missingOrEmptyObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def moveInArray[T](array: js.Array[T], objectsToMove: js.Array[T], toIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveInArray")(array.asInstanceOf[js.Any], objectsToMove.asInstanceOf[js.Any], toIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Mouse wheel (and 2-finger trackpad) support on the web sucks.  It is
    * complicated, thus this doc is long and (hopefully) detailed enough to answer
    * your questions.
    *
    * If you need to react to the mouse wheel in a predictable way, this code is
    * like your bestest friend. * hugs *
    *
    * As of today, there are 4 DOM event types you can listen to:
    *
    *   'wheel'                -- Chrome(31+), FF(17+), IE(9+)
    *   'mousewheel'           -- Chrome, IE(6+), Opera, Safari
    *   'MozMousePixelScroll'  -- FF(3.5 only!) (2010-2013) -- don't bother!
    *   'DOMMouseScroll'       -- FF(0.9.7+) since 2003
    *
    * So what to do?  The is the best:
    *
    *   normalizeWheel.getEventType();
    *
    * In your event callback, use this code to get sane interpretation of the
    * deltas.  This code will return an object with properties:
    *
    *   spinX   -- normalized spin speed (use for zoom) - x plane
    *   spinY   -- " - y plane
    *   pixelX  -- normalized distance (to pixels) - x plane
    *   pixelY  -- " - y plane
    *
    * Wheel values are provided by the browser assuming you are using the wheel to
    * scroll a web page by a number of lines or pixels (or pages).  Values can vary
    * significantly on different platforms and browsers, forgetting that you can
    * scroll at different speeds.  Some devices (like trackpads) emit more events
    * at smaller increments with fine granularity, and some emit massive jumps with
    * linear speed or acceleration.
    *
    * This code does its best to normalize the deltas for you:
    *
    *   - spin is trying to normalize how far the wheel was spun (or trackpad
    *     dragged).  This is super useful for zoom support where you want to
    *     throw away the chunky scroll steps on the PC and make those equal to
    *     the slow and smooth tiny steps on the Mac. Key data: This code tries to
    *     resolve a single slow step on a wheel to 1.
    *
    *   - pixel is normalizing the desired scroll delta in pixel units.  You'll
    *     get the crazy differences between browsers, but at least it'll be in
    *     pixels!
    *
    *   - positive value indicates scrolling DOWN/RIGHT, negative UP/LEFT.  This
    *     should translate to positive value zooming IN, negative zooming OUT.
    *     This matches the newer 'wheel' event.
    *
    * Why are there spinX, spinY (or pixels)?
    *
    *   - spinX is a 2-finger side drag on the trackpad, and a shift + wheel turn
    *     with a mouse.  It results in side-scrolling in the browser by default.
    *
    *   - spinY is what you expect -- it's the classic axis of a mouse wheel.
    *
    *   - I dropped spinZ/pixelZ.  It is supported by the DOM 3 'wheel' event and
    *     probably is by browsers in conjunction with fancy 3D controllers .. but
    *     you know.
    *
    * Implementation info:
    *
    * Examples of 'wheel' event if you scroll slowly (down) by one step with an
    * average mouse:
    *
    *   OS X + Chrome  (mouse)     -    4   pixel delta  (wheelDelta -120)
    *   OS X + Safari  (mouse)     -  N/A   pixel delta  (wheelDelta  -12)
    *   OS X + Firefox (mouse)     -    0.1 line  delta  (wheelDelta  N/A)
    *   Win8 + Chrome  (mouse)     -  100   pixel delta  (wheelDelta -120)
    *   Win8 + Firefox (mouse)     -    3   line  delta  (wheelDelta -120)
    *
    * On the trackpad:
    *
    *   OS X + Chrome  (trackpad)  -    2   pixel delta  (wheelDelta   -6)
    *   OS X + Firefox (trackpad)  -    1   pixel delta  (wheelDelta  N/A)
    *
    * On other/older browsers.. it's more complicated as there can be multiple and
    * also missing delta values.
    *
    * The 'wheel' event is more standard:
    *
    * http://www.w3.org/TR/DOM-Level-3-Events/#events-wheelevents
    *
    * The basics is that it includes a unit, deltaMode (pixels, lines, pages), and
    * deltaX, deltaY and deltaZ.  Some browsers provide other values to maintain
    * backward compatibility with older events.  Those other values help us
    * better normalize spin speed.  Example of what the browsers provide:
    *
    *                          | event.wheelDelta | event.detail
    *        ------------------+------------------+--------------
    *          Safari v5/OS X  |       -120       |       0
    *          Safari v5/Win7  |       -120       |       0
    *         Chrome v17/OS X  |       -120       |       0
    *         Chrome v17/Win7  |       -120       |       0
    *                IE9/Win7  |       -120       |   undefined
    *         Firefox v4/OS X  |     undefined    |       1
    *         Firefox v4/Win7  |     undefined    |       3
    *
    */
  inline def normalizeWheel(event: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeWheel")(event.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def offsetHeight(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("offsetHeight")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def offsetWidth(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("offsetWidth")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def pad(num: Double, totalStringSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(num.asInstanceOf[js.Any], totalStringSize.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseYyyyMmDdToDate(yyyyMmDd: String, separator: String): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parseYyyyMmDdToDate")(yyyyMmDd.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @JSImport("ag-grid", "_.passiveEvents")
  @js.native
  def passiveEvents: js.Array[String] = js.native
  inline def passiveEvents_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("passiveEvents")(x.asInstanceOf[js.Any])
  
  inline def prependDC(parent: HTMLElement, documentFragment: DocumentFragment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prependDC")(parent.asInstanceOf[js.Any], documentFragment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pushAll(target: js.Array[js.Any], source: js.Array[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pushAll")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def referenceCompare(left: js.Any, right: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("referenceCompare")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def removeAllChildren(node: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllChildren")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeAllFromArray[T](array: js.Array[T], toRemove: js.Array[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAllFromArray")(array.asInstanceOf[js.Any], toRemove.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeCssClass(element: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCssClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeElement(parent: HTMLElement, cssSelector: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeElement")(parent.asInstanceOf[js.Any], cssSelector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeFromArray[T](array: js.Array[T], `object`: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFromArray")(array.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeFromParent(node: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFromParent")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeRepeatsFromArray[T](array: js.Array[T], `object`: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeRepeatsFromArray")(array.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def serializeDateToYyyyMmDd(date: Date, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeDateToYyyyMmDd")(date.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def setCheckboxState(eCheckbox: js.Any, state: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCheckboxState")(eCheckbox.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setHidden(element: HTMLElement, hidden: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setHidden")(element.asInstanceOf[js.Any], hidden.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setScrollLeft(element: HTMLElement, value: Double, rtl: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setScrollLeft")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setVisible(element: HTMLElement, visible: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVisible")(element.asInstanceOf[js.Any], visible.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def shallowCompare(arr1: js.Array[js.Any], arr2: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompare")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sortNumberArray(numberArray: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sortNumberArray")(numberArray.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sortRowNodesByOrder(rowNodes: js.Array[typings.agGrid.rowNodeMod.RowNode], rowNodeOrder: StringDictionary[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortRowNodesByOrder")(rowNodes.asInstanceOf[js.Any], rowNodeOrder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stopPropagationForAgGrid(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPropagationForAgGrid")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stringSimilarity(str1: String, str2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("string_similarity")(str1.asInstanceOf[js.Any], str2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toStringOrNull(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toStringOrNull")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toStrings[T](array: js.Array[T]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toStrings")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def traverseNodesWithKey(
    nodes: js.Array[typings.agGrid.rowNodeMod.RowNode],
    callback: js.Function2[/* node */ typings.agGrid.rowNodeMod.RowNode, /* key */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseNodesWithKey")(nodes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def values[T](`object`: StringDictionary[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
