package typings
package agDashGridLib.agDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "Utils")
@js.native
class Utils ()
  extends agDashGridLib.distLibUtilsMod.Utils

/* static members */
@JSImport("ag-grid", "Utils")
@js.native
object Utils extends js.Object {
  var NUMPAD_DEL_NUMLOCK_ON_CHARCODE: js.Any = js.native
  var NUMPAD_DEL_NUMLOCK_ON_KEY: js.Any = js.native
  var PRINTABLE_CHARACTERS: js.Any = js.native
  var doOnceFlags: js.Any = js.native
  var iconNameClassMap: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var isChrome: js.Any = js.native
  var isEdge: js.Any = js.native
  var isFirefox: js.Any = js.native
  var isIE: js.Any = js.native
  var isIPad: js.Any = js.native
  var isSafari: js.Any = js.native
  var passiveEvents: js.Array[java.lang.String] = js.native
  def addAgGridEventPath(event: stdLib.Event): scala.Unit = js.native
  def addChangeListener(element: stdLib.HTMLElement, listener: stdLib.EventListener): scala.Unit = js.native
  def addCssClass(element: stdLib.HTMLElement, className: java.lang.String): scala.Unit = js.native
  def addOrRemoveCssClass(element: stdLib.HTMLElement, className: java.lang.String, addOrRemove: scala.Boolean): scala.Unit = js.native
  def addSafePassiveEventListener(
    eElement: stdLib.HTMLElement,
    event: java.lang.String,
    listener: js.Function1[/* event */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def addStylesToElement(eElement: js.Any, styles: js.Any): scala.Unit = js.native
  def anyExists(values: js.Array[_]): scala.Boolean = js.native
  def appendHtml(eContainer: stdLib.HTMLElement, htmlTemplate: java.lang.String): scala.Unit = js.native
  def areEventsNear(e1: stdLib.MouseEvent, e2: stdLib.MouseEvent, pixelCount: scala.Double): scala.Boolean = js.native
  def areEventsNear(e1: stdLib.MouseEvent, e2: stdLib.Touch, pixelCount: scala.Double): scala.Boolean = js.native
  def areEventsNear(e1: stdLib.Touch, e2: stdLib.MouseEvent, pixelCount: scala.Double): scala.Boolean = js.native
  def areEventsNear(e1: stdLib.Touch, e2: stdLib.Touch, pixelCount: scala.Double): scala.Boolean = js.native
  def assign(`object`: js.Any, sources: js.Any*): js.Any = js.native
  def callIfPresent(func: js.Function): scala.Unit = js.native
  def camelCaseToHumanText(camelCase: java.lang.String): java.lang.String = js.native
  def camelCaseToHyphen(str: java.lang.String): java.lang.String = js.native
  def cleanNumber(value: js.Any): scala.Double = js.native
  def cloneObject[T](`object`: T): T = js.native
  def compareArrays(array1: js.Array[_], array2: js.Array[_]): scala.Boolean = js.native
  def containsClass(element: js.Any, className: java.lang.String): scala.Boolean = js.native
  def copyNodeList(nodeList: stdLib.NodeList): js.Array[stdLib.Node] = js.native
  def createArrayOfNumbers(first: scala.Double, last: scala.Double): js.Array[scala.Double] = js.native
  def createEventPath(event: stdLib.Event): js.Array[stdLib.EventTarget] = js.native
  /**
    * If icon provided, use this (either a string, or a function callback).
    * if not, then use the default icon from the theme
    */
  def createIcon(
    iconName: java.lang.String,
    gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    column: agDashGridLib.distLibEntitiesColumnMod.Column
  ): stdLib.HTMLElement = js.native
  def createIconNoSpan(
    iconName: java.lang.String,
    gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    column: agDashGridLib.distLibEntitiesColumnMod.Column
  ): stdLib.HTMLElement = js.native
  def cssStyleObjectToMarkup(stylesToUse: js.Any): java.lang.String = js.native
  /**
    * https://stackoverflow.com/questions/24004791/can-someone-explain-the-debounce-function-in-javascript
    */
  def debounce(func: js.Function0[scala.Unit], wait: scala.Double): js.Function0[scala.Unit] = js.native
  def debounce(func: js.Function0[scala.Unit], wait: scala.Double, immediate: scala.Boolean): js.Function0[scala.Unit] = js.native
  def defaultComparator(valueA: js.Any, valueB: js.Any): scala.Double = js.native
  def defaultComparator(valueA: js.Any, valueB: js.Any, accentedCompare: scala.Boolean): scala.Double = js.native
  def doOnce(func: js.Function0[scala.Unit], key: java.lang.String): scala.Unit = js.native
  def ensureDomOrder(eContainer: stdLib.HTMLElement, eChild: stdLib.HTMLElement, eChildBefore: stdLib.HTMLElement): scala.Unit = js.native
  def escape(toEscape: java.lang.String): java.lang.String = js.native
  def every[T](items: js.Array[T], callback: js.Function1[/* item */ T, scala.Boolean]): scala.Boolean = js.native
  def executeAfter(funcs: js.Array[js.Function], millis: scala.Double): scala.Unit = js.native
  def executeInAWhile(funcs: js.Array[js.Function]): scala.Unit = js.native
  def executeNextVMTurn(funcs: js.Array[js.Function]): scala.Unit = js.native
  def exists(value: js.Any): scala.Boolean = js.native
  def existsAndNotEmpty(value: js.Array[_]): scala.Boolean = js.native
  def filter[T](array: js.Array[T], callback: js.Function1[/* item */ T, scala.Boolean]): js.Array[T] = js.native
  def find[T](collection: js.Array[T], predicate: java.lang.String): T = js.native
  def find[T](collection: js.Array[T], predicate: java.lang.String, value: js.Any): T = js.native
  def find[T](collection: js.Array[T], predicate: js.Function1[/* item */ T, scala.Unit]): T = js.native
  def find[T](collection: js.Array[T], predicate: js.Function1[/* item */ T, scala.Unit], value: js.Any): T = js.native
  def find[T](collection: js.Array[T], predicate: scala.Boolean): T = js.native
  def find[T](collection: js.Array[T], predicate: scala.Boolean, value: js.Any): T = js.native
  def find[T](collection: org.scalablytyped.runtime.StringDictionary[T], predicate: java.lang.String): T = js.native
  def find[T](
    collection: org.scalablytyped.runtime.StringDictionary[T],
    predicate: java.lang.String,
    value: js.Any
  ): T = js.native
  def find[T](
    collection: org.scalablytyped.runtime.StringDictionary[T],
    predicate: js.Function1[/* item */ T, scala.Unit]
  ): T = js.native
  def find[T](
    collection: org.scalablytyped.runtime.StringDictionary[T],
    predicate: js.Function1[/* item */ T, scala.Unit],
    value: js.Any
  ): T = js.native
  def find[T](collection: org.scalablytyped.runtime.StringDictionary[T], predicate: scala.Boolean): T = js.native
  def find[T](collection: org.scalablytyped.runtime.StringDictionary[T], predicate: scala.Boolean, value: js.Any): T = js.native
  def firstExistingValue[A](values: A*): A = js.native
  def forEach[T](array: js.Array[T], callback: js.Function2[/* item */ T, /* index */ scala.Double, scala.Unit]): scala.Unit = js.native
  def forEachSnapshotFirst(list: js.Array[_], callback: js.Function1[/* item */ js.Any, scala.Unit]): scala.Unit = js.native
  def formatNumberCommas(value: scala.Double): java.lang.String = js.native
  def formatNumberTwoDecimalPlacesAndCommas(value: scala.Double): java.lang.String = js.native
  def formatWidth(width: java.lang.String): java.lang.String = js.native
  def formatWidth(width: scala.Double): java.lang.String = js.native
  def fuzzyCheckStrings(
    inputValues: js.Array[java.lang.String],
    validValues: js.Array[java.lang.String],
    allSuggestions: js.Array[java.lang.String]
  ): org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = js.native
  def fuzzySuggestions(
    inputValue: java.lang.String,
    validValues: js.Array[java.lang.String],
    allSuggestions: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  def get(
    source: org.scalablytyped.runtime.StringDictionary[js.Any],
    expression: java.lang.String,
    defaultValue: js.Any
  ): js.Any = js.native
  def getAllKeysInObjects(objects: js.Array[_]): js.Array[java.lang.String] = js.native
  def getBodyHeight(): scala.Double = js.native
  def getBodyWidth(): scala.Double = js.native
  def getElementAttribute(element: js.Any, attributeName: java.lang.String): java.lang.String = js.native
  def getEventPath(event: stdLib.Event): js.Array[stdLib.EventTarget] = js.native
  def getFunctionParameters(func: js.Any): js.Any = js.native
  def getMaxDivHeight(): scala.Double = js.native
  def getNameOfClass(TheClass: js.Any): java.lang.String = js.native
  def getScrollLeft(element: stdLib.HTMLElement, rtl: scala.Boolean): scala.Double = js.native
  def getScrollbarWidth(): scala.Double = js.native
  def getTarget(event: stdLib.Event): stdLib.Element = js.native
  def getValueUsingField(data: js.Any, field: java.lang.String, fieldContainsDots: scala.Boolean): js.Any = js.native
  def get_bigrams(from: java.lang.String): js.Array[_] = js.native
  def hyphenToCamelCase(str: java.lang.String): java.lang.String = js.native
  def insertArrayIntoArray[T](dest: js.Array[T], src: js.Array[T], toIndex: scala.Double): scala.Unit = js.native
  def insertIntoArray[T](array: js.Array[T], `object`: T, toIndex: scala.Double): scala.Unit = js.native
  def insertTemplateWithDomOrder(eContainer: stdLib.HTMLElement, htmlTemplate: java.lang.String, eChildBefore: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def insertWithDomOrder(eContainer: stdLib.HTMLElement, eChild: stdLib.HTMLElement, eChildBefore: stdLib.HTMLElement): scala.Unit = js.native
  def isBrowserChrome(): scala.Boolean = js.native
  def isBrowserEdge(): scala.Boolean = js.native
  def isBrowserFirefox(): scala.Boolean = js.native
  def isBrowserIE(): scala.Boolean = js.native
  def isBrowserSafari(): scala.Boolean = js.native
  def isElement(o: js.Any): scala.Boolean = js.native
  def isElementInEventPath(element: stdLib.HTMLElement, event: stdLib.Event): scala.Boolean = js.native
  def isEventFromPrintableCharacter(event: stdLib.KeyboardEvent): scala.Boolean = js.native
  def isHorizontalScrollShowing(element: stdLib.HTMLElement): scala.Boolean = js.native
  def isKeyPressed(event: stdLib.KeyboardEvent, keyToCheck: scala.Double): scala.Boolean = js.native
  def isNode(o: js.Any): scala.Boolean = js.native
  def isNodeOrElement(o: js.Any): scala.Boolean = js.native
  /**
    * From http://stackoverflow.com/questions/9716468/is-there-any-function-like-isnumeric-in-javascript-to-validate-numbers
    */
  def isNumeric(value: js.Any): scala.Boolean = js.native
  /* private */ def isNumpadDelWithNumlockOnForEdgeOrIe(event: js.Any): js.Any = js.native
  def isStopPropagationForAgGrid(event: stdLib.Event): scala.Boolean = js.native
  def isUserAgentIPad(): scala.Boolean = js.native
  def isVerticalScrollShowing(element: stdLib.HTMLElement): scala.Boolean = js.native
  def isVisible(element: stdLib.HTMLElement): scala.Boolean = js.native
  def iterateArray[T](array: js.Array[T], callback: js.Function2[/* item */ T, /* index */ scala.Double, scala.Unit]): scala.Unit = js.native
  def iterateNamedNodeMap(
    map: stdLib.NamedNodeMap,
    callback: js.Function2[/* key */ java.lang.String, /* value */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def iterateObject[T](
    `object`: js.Array[T],
    callback: js.Function2[/* key */ java.lang.String, /* value */ T, scala.Unit]
  ): scala.Unit = js.native
  def iterateObject[T](
    `object`: org.scalablytyped.runtime.StringDictionary[T],
    callback: js.Function2[/* key */ java.lang.String, /* value */ T, scala.Unit]
  ): scala.Unit = js.native
  /**
    * loads the template and returns it as an element. makes up for no simple way in
    * the dom api to load html directly, eg we cannot do this: document.createElement(template)
    */
  def loadTemplate(template: java.lang.String): stdLib.HTMLElement = js.native
  def makeNull[T](value: T): T = js.native
  def map[TItem, TResult](array: js.Array[TItem], callback: js.Function1[/* item */ TItem, TResult]): js.Array[TResult] = js.native
  def mapObject[TResult](`object`: js.Any, callback: js.Function1[/* item */ js.Any, TResult]): js.Array[TResult] = js.native
  def mergeDeep(dest: js.Any, source: js.Any): scala.Unit = js.native
  def message(msg: java.lang.String): scala.Unit = js.native
  def missing(value: js.Any): scala.Boolean = js.native
  def missingOrEmpty(value: java.lang.String): scala.Boolean = js.native
  def missingOrEmpty(value: js.Array[_]): scala.Boolean = js.native
  def missingOrEmptyObject(value: js.Any): scala.Boolean = js.native
  def moveInArray[T](array: js.Array[T], objectsToMove: js.Array[T], toIndex: scala.Double): scala.Unit = js.native
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
  def normalizeWheel(event: js.Any): js.Any = js.native
  def offsetHeight(element: stdLib.HTMLElement): scala.Double = js.native
  def offsetWidth(element: stdLib.HTMLElement): scala.Double = js.native
  def pad(num: scala.Double, totalStringSize: scala.Double): java.lang.String = js.native
  def parseYyyyMmDdToDate(yyyyMmDd: java.lang.String, separator: java.lang.String): stdLib.Date = js.native
  def prependDC(parent: stdLib.HTMLElement, documentFragment: stdLib.DocumentFragment): scala.Unit = js.native
  def pushAll(target: js.Array[_], source: js.Array[_]): scala.Unit = js.native
  def referenceCompare(left: js.Any, right: js.Any): scala.Boolean = js.native
  def removeAllChildren(node: stdLib.HTMLElement): scala.Unit = js.native
  def removeAllFromArray[T](array: js.Array[T], toRemove: js.Array[T]): scala.Unit = js.native
  def removeCssClass(element: stdLib.HTMLElement, className: java.lang.String): scala.Unit = js.native
  def removeElement(parent: stdLib.HTMLElement, cssSelector: java.lang.String): scala.Unit = js.native
  def removeFromArray[T](array: js.Array[T], `object`: T): scala.Unit = js.native
  def removeFromParent(node: stdLib.Element): scala.Unit = js.native
  def removeRepeatsFromArray[T](array: js.Array[T], `object`: T): scala.Unit = js.native
  def serializeDateToYyyyMmDd(date: stdLib.Date, separator: java.lang.String): java.lang.String = js.native
  def setCheckboxState(eCheckbox: js.Any, state: js.Any): scala.Unit = js.native
  def setHidden(element: stdLib.HTMLElement, hidden: scala.Boolean): scala.Unit = js.native
  def setScrollLeft(element: stdLib.HTMLElement, value: scala.Double, rtl: scala.Boolean): scala.Unit = js.native
  def setVisible(element: stdLib.HTMLElement, visible: scala.Boolean): scala.Unit = js.native
  def shallowCompare(arr1: js.Array[_], arr2: js.Array[_]): scala.Boolean = js.native
  def sortNumberArray(numberArray: js.Array[scala.Double]): scala.Unit = js.native
  def sortRowNodesByOrder(
    rowNodes: js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode],
    rowNodeOrder: org.scalablytyped.runtime.StringDictionary[scala.Double]
  ): scala.Unit = js.native
  def stopPropagationForAgGrid(event: stdLib.Event): scala.Unit = js.native
  def string_similarity(str1: java.lang.String, str2: java.lang.String): scala.Double = js.native
  def toStringOrNull(value: js.Any): java.lang.String = js.native
  def toStrings[T](array: js.Array[T]): js.Array[java.lang.String] = js.native
  def traverseNodesWithKey(
    nodes: js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode],
    callback: js.Function2[
      /* node */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, 
      /* key */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def values[T](`object`: org.scalablytyped.runtime.StringDictionary[T]): js.Array[T] = js.native
}

