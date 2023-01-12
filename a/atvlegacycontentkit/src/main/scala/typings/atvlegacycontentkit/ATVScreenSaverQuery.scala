package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The query supplied when querying screensaver images.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVScreenSaverQuery extends StObject {
  
  /**
    * The filter supplied. There are always two of these. See the ATVScreenSaverFilter type for more information.
    */
  var filters: js.Array[ATVScreenSaverFilter]
  
  /**
    * How many images should be supplied.
    */
  var length: Double
  
  /**
    * Whether to shuffle the images or not. Seems to always be true.
    */
  var shuffle: Boolean
}
object ATVScreenSaverQuery {
  
  inline def apply(filters: js.Array[ATVScreenSaverFilter], length: Double, shuffle: Boolean): ATVScreenSaverQuery = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], shuffle = shuffle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATVScreenSaverQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ATVScreenSaverQuery] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: js.Array[ATVScreenSaverFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: ATVScreenSaverFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
  }
}
