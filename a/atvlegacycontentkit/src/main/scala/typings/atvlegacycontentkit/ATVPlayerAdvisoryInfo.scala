package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Advisory information about the item. This is basically detailed information about why the rating was accorded (e.g. specifying if the show has violance, sex scenes, bad language, etc.).
  *
  * The formats for these are dependant on the country, so may vary. This is written from a New Zealand perspective and their rating systems.
  *
  * Again, this class is very dependant on TV+ specific stuff, so isn't likely to be useful elsewhere.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVPlayerAdvisoryInfo extends StObject {
  
  /**
    * A human readable description of the advisory (e.g. Use of bad language). This is obtained from com.apple.hls.advisory-info.x.value in the session data of the HLS file, where 'x' is the
    * index of the advisory.
    */
  var ratingDescription: String
  
  /**
    * A code that belongs to that specific advisory (e.g. L for bad language). This is obtained from com.apple.hls.advisory-info.x.key in the session data of the HLS file, where 'x' is the index
    * of the advisory.
    */
  var ratingName: String
}
object ATVPlayerAdvisoryInfo {
  
  inline def apply(ratingDescription: String, ratingName: String): ATVPlayerAdvisoryInfo = {
    val __obj = js.Dynamic.literal(ratingDescription = ratingDescription.asInstanceOf[js.Any], ratingName = ratingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATVPlayerAdvisoryInfo]
  }
  
  extension [Self <: ATVPlayerAdvisoryInfo](x: Self) {
    
    inline def setRatingDescription(value: String): Self = StObject.set(x, "ratingDescription", value.asInstanceOf[js.Any])
    
    inline def setRatingName(value: String): Self = StObject.set(x, "ratingName", value.asInstanceOf[js.Any])
  }
}
