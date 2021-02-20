package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGMaskElement extends StObject {
  
  @JSName("MSHTML.SVGMaskElement_typekey")
  var MSHTMLDotSVGMaskElement_typekey: SVGMaskElement = js.native
  
  val className: SVGAnimatedString = js.native
  
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  
  var focusable: SVGAnimatedEnumeration = js.native
  
  def hasExtension(extension: String): Boolean = js.native
  
  var height: SVGAnimatedLength = js.native
  
  var maskContentUnits: SVGAnimatedEnumeration = js.native
  
  var maskUnits: SVGAnimatedEnumeration = js.native
  
  var ownerSVGElement: ISVGSVGElement = js.native
  
  val requiredExtensions: SVGStringList = js.native
  
  val requiredFeatures: SVGStringList = js.native
  
  val systemLanguage: SVGStringList = js.native
  
  var viewportElement: ISVGElement = js.native
  
  var width: SVGAnimatedLength = js.native
  
  var x: SVGAnimatedLength = js.native
  
  var xmlbase: String = js.native
  
  var xmllang: String = js.native
  
  var xmlspace: String = js.native
  
  var y: SVGAnimatedLength = js.native
}
object SVGMaskElement {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGMaskElement_typekey: SVGMaskElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    hasExtension: String => Boolean,
    height: SVGAnimatedLength,
    maskContentUnits: SVGAnimatedEnumeration,
    maskUnits: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    systemLanguage: SVGStringList,
    viewportElement: ISVGElement,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    xmlbase: String,
    xmllang: String,
    xmlspace: String,
    y: SVGAnimatedLength
  ): SVGMaskElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], hasExtension = js.Any.fromFunction1(hasExtension), height = height.asInstanceOf[js.Any], maskContentUnits = maskContentUnits.asInstanceOf[js.Any], maskUnits = maskUnits.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGMaskElement_typekey")(MSHTMLDotSVGMaskElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGMaskElement]
  }
  
  @scala.inline
  implicit class SVGMaskElementMutableBuilder[Self <: SVGMaskElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: SVGAnimatedString): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasExtension(value: String => Boolean): Self = StObject.set(x, "hasExtension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: SVGAnimatedLength): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGMaskElement_typekey(value: SVGMaskElement): Self = StObject.set(x, "MSHTML.SVGMaskElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskContentUnits(value: SVGAnimatedEnumeration): Self = StObject.set(x, "maskContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUnits(value: SVGAnimatedEnumeration): Self = StObject.set(x, "maskUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredExtensions(value: SVGStringList): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredFeatures(value: SVGStringList): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemLanguage(value: SVGStringList): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: SVGAnimatedLength): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: SVGAnimatedLength): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmllang(value: String): Self = StObject.set(x, "xmllang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlspace(value: String): Self = StObject.set(x, "xmlspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: SVGAnimatedLength): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
