package typings.aliOss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Etag extends StObject {
  
  var etag: String
  
  var number: Double
}
object Etag {
  
  @scala.inline
  def apply(etag: String, number: Double): Etag = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Etag]
  }
  
  @scala.inline
  implicit class EtagMutableBuilder[Self <: Etag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
