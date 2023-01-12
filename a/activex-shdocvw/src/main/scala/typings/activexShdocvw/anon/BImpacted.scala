package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BImpacted extends StObject {
  
  val bImpacted: Boolean
}
object BImpacted {
  
  inline def apply(bImpacted: Boolean): BImpacted = {
    val __obj = js.Dynamic.literal(bImpacted = bImpacted.asInstanceOf[js.Any])
    __obj.asInstanceOf[BImpacted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BImpacted] (val x: Self) extends AnyVal {
    
    inline def setBImpacted(value: Boolean): Self = StObject.set(x, "bImpacted", value.asInstanceOf[js.Any])
  }
}
