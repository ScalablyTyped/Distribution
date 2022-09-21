package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// SCEService
// see http://docs.angularjs.org/api/ng/service/$sce
///////////////////////////////////////////////////////////////////////////
trait ISCEService extends StObject {
  
  def getTrusted(`type`: String, mayBeTrusted: Any): Any
  
  def getTrustedCss(value: Any): Any
  
  def getTrustedHtml(value: Any): Any
  
  def getTrustedJs(value: Any): Any
  
  def getTrustedResourceUrl(value: Any): Any
  
  def getTrustedUrl(value: Any): Any
  
  def isEnabled(): Boolean
  
  def parse(`type`: String, expression: String): js.Function2[/* context */ Any, /* locals */ Any, Any]
  
  def parseAsCss(expression: String): js.Function2[/* context */ Any, /* locals */ Any, Any]
  
  def parseAsHtml(expression: String): js.Function2[/* context */ Any, /* locals */ Any, Any]
  
  def parseAsJs(expression: String): js.Function2[/* context */ Any, /* locals */ Any, Any]
  
  def parseAsResourceUrl(expression: String): js.Function2[/* context */ Any, /* locals */ Any, Any]
  
  def parseAsUrl(expression: String): js.Function2[/* context */ Any, /* locals */ Any, Any]
  
  def trustAs(`type`: String, value: Any): Any
  
  def trustAsHtml(value: Any): Any
  
  def trustAsJs(value: Any): Any
  
  def trustAsResourceUrl(value: Any): Any
  
  def trustAsUrl(value: Any): Any
}
object ISCEService {
  
  inline def apply(
    getTrusted: (String, Any) => Any,
    getTrustedCss: Any => Any,
    getTrustedHtml: Any => Any,
    getTrustedJs: Any => Any,
    getTrustedResourceUrl: Any => Any,
    getTrustedUrl: Any => Any,
    isEnabled: () => Boolean,
    parse: (String, String) => js.Function2[/* context */ Any, /* locals */ Any, Any],
    parseAsCss: String => js.Function2[/* context */ Any, /* locals */ Any, Any],
    parseAsHtml: String => js.Function2[/* context */ Any, /* locals */ Any, Any],
    parseAsJs: String => js.Function2[/* context */ Any, /* locals */ Any, Any],
    parseAsResourceUrl: String => js.Function2[/* context */ Any, /* locals */ Any, Any],
    parseAsUrl: String => js.Function2[/* context */ Any, /* locals */ Any, Any],
    trustAs: (String, Any) => Any,
    trustAsHtml: Any => Any,
    trustAsJs: Any => Any,
    trustAsResourceUrl: Any => Any,
    trustAsUrl: Any => Any
  ): ISCEService = {
    val __obj = js.Dynamic.literal(getTrusted = js.Any.fromFunction2(getTrusted), getTrustedCss = js.Any.fromFunction1(getTrustedCss), getTrustedHtml = js.Any.fromFunction1(getTrustedHtml), getTrustedJs = js.Any.fromFunction1(getTrustedJs), getTrustedResourceUrl = js.Any.fromFunction1(getTrustedResourceUrl), getTrustedUrl = js.Any.fromFunction1(getTrustedUrl), isEnabled = js.Any.fromFunction0(isEnabled), parse = js.Any.fromFunction2(parse), parseAsCss = js.Any.fromFunction1(parseAsCss), parseAsHtml = js.Any.fromFunction1(parseAsHtml), parseAsJs = js.Any.fromFunction1(parseAsJs), parseAsResourceUrl = js.Any.fromFunction1(parseAsResourceUrl), parseAsUrl = js.Any.fromFunction1(parseAsUrl), trustAs = js.Any.fromFunction2(trustAs), trustAsHtml = js.Any.fromFunction1(trustAsHtml), trustAsJs = js.Any.fromFunction1(trustAsJs), trustAsResourceUrl = js.Any.fromFunction1(trustAsResourceUrl), trustAsUrl = js.Any.fromFunction1(trustAsUrl))
    __obj.asInstanceOf[ISCEService]
  }
  
  extension [Self <: ISCEService](x: Self) {
    
    inline def setGetTrusted(value: (String, Any) => Any): Self = StObject.set(x, "getTrusted", js.Any.fromFunction2(value))
    
    inline def setGetTrustedCss(value: Any => Any): Self = StObject.set(x, "getTrustedCss", js.Any.fromFunction1(value))
    
    inline def setGetTrustedHtml(value: Any => Any): Self = StObject.set(x, "getTrustedHtml", js.Any.fromFunction1(value))
    
    inline def setGetTrustedJs(value: Any => Any): Self = StObject.set(x, "getTrustedJs", js.Any.fromFunction1(value))
    
    inline def setGetTrustedResourceUrl(value: Any => Any): Self = StObject.set(x, "getTrustedResourceUrl", js.Any.fromFunction1(value))
    
    inline def setGetTrustedUrl(value: Any => Any): Self = StObject.set(x, "getTrustedUrl", js.Any.fromFunction1(value))
    
    inline def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
    
    inline def setParse(value: (String, String) => js.Function2[/* context */ Any, /* locals */ Any, Any]): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    
    inline def setParseAsCss(value: String => js.Function2[/* context */ Any, /* locals */ Any, Any]): Self = StObject.set(x, "parseAsCss", js.Any.fromFunction1(value))
    
    inline def setParseAsHtml(value: String => js.Function2[/* context */ Any, /* locals */ Any, Any]): Self = StObject.set(x, "parseAsHtml", js.Any.fromFunction1(value))
    
    inline def setParseAsJs(value: String => js.Function2[/* context */ Any, /* locals */ Any, Any]): Self = StObject.set(x, "parseAsJs", js.Any.fromFunction1(value))
    
    inline def setParseAsResourceUrl(value: String => js.Function2[/* context */ Any, /* locals */ Any, Any]): Self = StObject.set(x, "parseAsResourceUrl", js.Any.fromFunction1(value))
    
    inline def setParseAsUrl(value: String => js.Function2[/* context */ Any, /* locals */ Any, Any]): Self = StObject.set(x, "parseAsUrl", js.Any.fromFunction1(value))
    
    inline def setTrustAs(value: (String, Any) => Any): Self = StObject.set(x, "trustAs", js.Any.fromFunction2(value))
    
    inline def setTrustAsHtml(value: Any => Any): Self = StObject.set(x, "trustAsHtml", js.Any.fromFunction1(value))
    
    inline def setTrustAsJs(value: Any => Any): Self = StObject.set(x, "trustAsJs", js.Any.fromFunction1(value))
    
    inline def setTrustAsResourceUrl(value: Any => Any): Self = StObject.set(x, "trustAsResourceUrl", js.Any.fromFunction1(value))
    
    inline def setTrustAsUrl(value: Any => Any): Self = StObject.set(x, "trustAsUrl", js.Any.fromFunction1(value))
  }
}
