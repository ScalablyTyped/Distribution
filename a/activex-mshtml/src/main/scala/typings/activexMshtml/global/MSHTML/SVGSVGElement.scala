package typings.activexMshtml.global.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.SVGSVGElement")
@js.native
class SVGSVGElement protected ()
  extends StObject
     with typings.activexMshtml.MSHTML.SVGSVGElement {
  
  /* CompleteClass */
  @JSName("MSHTML.SVGSVGElement_typekey")
  var MSHTMLDotSVGSVGElement_typekey: typings.activexMshtml.MSHTML.SVGSVGElement = js.native
  
  /* CompleteClass */
  override def animationsPaused(): Boolean = js.native
  
  /* CompleteClass */
  override def checkEnclosure(element: typings.activexMshtml.MSHTML.ISVGElement, rect: typings.activexMshtml.MSHTML.SVGRect): Boolean = js.native
  
  /* CompleteClass */
  override def checkIntersection(element: typings.activexMshtml.MSHTML.ISVGElement, rect: typings.activexMshtml.MSHTML.SVGRect): Boolean = js.native
  
  /* CompleteClass */
  override val className: typings.activexMshtml.MSHTML.SVGAnimatedString = js.native
  
  /* CompleteClass */
  var contentScriptType: String = js.native
  
  /* CompleteClass */
  var contentStyleType: String = js.native
  
  /* CompleteClass */
  override def createSVGAngle(): typings.activexMshtml.MSHTML.SVGAngle = js.native
  
  /* CompleteClass */
  override def createSVGLength(): typings.activexMshtml.MSHTML.SVGLength = js.native
  
  /* CompleteClass */
  override def createSVGMatrix(): typings.activexMshtml.MSHTML.SVGMatrix = js.native
  
  /* CompleteClass */
  override def createSVGNumber(): typings.activexMshtml.MSHTML.SVGNumber = js.native
  
  /* CompleteClass */
  override def createSVGPoint(): typings.activexMshtml.MSHTML.SVGPoint = js.native
  
  /* CompleteClass */
  override def createSVGRect(): typings.activexMshtml.MSHTML.SVGRect = js.native
  
  /* CompleteClass */
  override def createSVGTransform(): typings.activexMshtml.MSHTML.SVGTransform = js.native
  
  /* CompleteClass */
  override def createSVGTransformFromMatrix(matrix: typings.activexMshtml.MSHTML.SVGMatrix): typings.activexMshtml.MSHTML.SVGTransform = js.native
  
  /* CompleteClass */
  var currentScale: Double = js.native
  
  /* CompleteClass */
  var currentTranslate: typings.activexMshtml.MSHTML.SVGPoint = js.native
  
  /* CompleteClass */
  var currentView: typings.activexMshtml.MSHTML.ISVGViewSpec = js.native
  
  /* CompleteClass */
  override def deselectAll(): Unit = js.native
  
  /* CompleteClass */
  override val externalResourcesRequired: typings.activexMshtml.MSHTML.SVGAnimatedBoolean = js.native
  
  /* CompleteClass */
  override val farthestViewportElement: typings.activexMshtml.MSHTML.ISVGElement = js.native
  
  /* CompleteClass */
  var focusable: typings.activexMshtml.MSHTML.SVGAnimatedEnumeration = js.native
  
  /* CompleteClass */
  override def forceRedraw(): Unit = js.native
  
  /* CompleteClass */
  override def getBBox(): typings.activexMshtml.MSHTML.SVGRect = js.native
  
  /* CompleteClass */
  override def getCTM(): typings.activexMshtml.MSHTML.SVGMatrix = js.native
  
  /* CompleteClass */
  override def getCurrentTime(): Double = js.native
  
  /* CompleteClass */
  override def getElementById(elementId: String): typings.activexMshtml.MSHTML.IHTMLElement = js.native
  
  /* CompleteClass */
  override def getEnclosureList(
    rect: typings.activexMshtml.MSHTML.SVGRect,
    referenceElement: typings.activexMshtml.MSHTML.ISVGElement
  ): js.Any = js.native
  
  /* CompleteClass */
  override def getIntersectionList(
    rect: typings.activexMshtml.MSHTML.SVGRect,
    referenceElement: typings.activexMshtml.MSHTML.ISVGElement
  ): js.Any = js.native
  
  /* CompleteClass */
  override def getScreenCTM(): typings.activexMshtml.MSHTML.SVGMatrix = js.native
  
  /* CompleteClass */
  override def getTransformToElement(pElement: typings.activexMshtml.MSHTML.ISVGElement): typings.activexMshtml.MSHTML.SVGMatrix = js.native
  
  /* CompleteClass */
  override def hasExtension(`extension`: String): Boolean = js.native
  
  /* CompleteClass */
  var height: typings.activexMshtml.MSHTML.SVGAnimatedLength = js.native
  
  /* CompleteClass */
  override val nearestViewportElement: typings.activexMshtml.MSHTML.ISVGElement = js.native
  
  /* CompleteClass */
  var ownerSVGElement: typings.activexMshtml.MSHTML.ISVGSVGElement = js.native
  
  /* CompleteClass */
  override def pauseAnimations(): Unit = js.native
  
  /* CompleteClass */
  var pixelUnitToMillimeterX: Double = js.native
  
  /* CompleteClass */
  var pixelUnitToMillimeterY: Double = js.native
  
  /* CompleteClass */
  var preserveAspectRatio: typings.activexMshtml.MSHTML.SVGAnimatedPreserveAspectRatio = js.native
  
  /* CompleteClass */
  override val requiredExtensions: typings.activexMshtml.MSHTML.SVGStringList = js.native
  
  /* CompleteClass */
  override val requiredFeatures: typings.activexMshtml.MSHTML.SVGStringList = js.native
  
  /* CompleteClass */
  var screenPixelToMillimeterX: Double = js.native
  
  /* CompleteClass */
  var screenPixelToMillimeterY: Double = js.native
  
  /* CompleteClass */
  override def setCurrentTime(seconds: Double): Unit = js.native
  
  /* CompleteClass */
  override def suspendRedraw(maxWaitMilliseconds: Double): Double = js.native
  
  /* CompleteClass */
  override val systemLanguage: typings.activexMshtml.MSHTML.SVGStringList = js.native
  
  /* CompleteClass */
  override def unpauseAnimations(): Unit = js.native
  
  /* CompleteClass */
  override def unsuspendRedraw(suspendHandeID: Double): Unit = js.native
  
  /* CompleteClass */
  override def unsuspendRedrawAll(): Unit = js.native
  
  /* CompleteClass */
  var useCurrentView: Boolean = js.native
  
  /* CompleteClass */
  override val viewBox: typings.activexMshtml.MSHTML.SVGAnimatedRect = js.native
  
  /* CompleteClass */
  var viewport: typings.activexMshtml.MSHTML.SVGRect = js.native
  
  /* CompleteClass */
  var viewportElement: typings.activexMshtml.MSHTML.ISVGElement = js.native
  
  /* CompleteClass */
  var width: typings.activexMshtml.MSHTML.SVGAnimatedLength = js.native
  
  /* CompleteClass */
  var x: typings.activexMshtml.MSHTML.SVGAnimatedLength = js.native
  
  /* CompleteClass */
  var xmlbase: String = js.native
  
  /* CompleteClass */
  var xmllang: String = js.native
  
  /* CompleteClass */
  var xmlspace: String = js.native
  
  /* CompleteClass */
  var y: typings.activexMshtml.MSHTML.SVGAnimatedLength = js.native
  
  /* CompleteClass */
  override val zoomAndPan: Double = js.native
}
