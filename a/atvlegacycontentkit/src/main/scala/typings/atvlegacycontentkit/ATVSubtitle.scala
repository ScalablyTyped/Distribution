package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the subtitles returned by the callback.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVSubtitle extends StObject {
  
  /**
    * The language code for this subtitle, in the BCP 47 format. For example, 'en' for English.
    */
  var bcp47: String
  
  /**
    * Unclear, but likely whether the subtitles are considered closed captions or not.
    */
  var cc: Boolean
  
  /**
    * Unclear, but likely whether these subtitles are forced or not.
    */
  var forced: Boolean
  
  /**
    * The name of the subtitle (e.g. English).
    */
  var name: String
  
  /**
    * Whether the subtitles include non-dialogue audio (e.g. sound effects).
    */
  var sdh: Boolean
  
  /**
    * Whether these subtitles are considered subtitles (vs captions).
    */
  var subtitle: Boolean
}
object ATVSubtitle {
  
  inline def apply(bcp47: String, cc: Boolean, forced: Boolean, name: String, sdh: Boolean, subtitle: Boolean): ATVSubtitle = {
    val __obj = js.Dynamic.literal(bcp47 = bcp47.asInstanceOf[js.Any], cc = cc.asInstanceOf[js.Any], forced = forced.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sdh = sdh.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATVSubtitle]
  }
  
  extension [Self <: ATVSubtitle](x: Self) {
    
    inline def setBcp47(value: String): Self = StObject.set(x, "bcp47", value.asInstanceOf[js.Any])
    
    inline def setCc(value: Boolean): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
    
    inline def setForced(value: Boolean): Self = StObject.set(x, "forced", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSdh(value: Boolean): Self = StObject.set(x, "sdh", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: Boolean): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
  }
}
