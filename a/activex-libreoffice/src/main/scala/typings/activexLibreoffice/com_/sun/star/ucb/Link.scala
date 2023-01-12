package typings.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines a link.
  * @see XCommandProcessor
  */
trait Link extends StObject {
  
  /** contains the destination URI of the link. */
  var Destination: String
  
  /** contains the source URI of the link. */
  var Source: String
}
object Link {
  
  inline def apply(Destination: String, Source: String): Link = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: String): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
