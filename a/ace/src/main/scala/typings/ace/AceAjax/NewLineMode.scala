package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////
/// Document
////////////////
/**
  * Contains the text of the document. Document can be attached to several [[EditSession `EditSession`]]s.
  * At its core, `Document`s are just an array of strings, with each row in the document matching up to the array index.
  **/
/* Rewritten from type alias, can be one of: 
  - typings.ace.aceStrings.auto
  - typings.ace.aceStrings.unix
  - typings.ace.aceStrings.windows
*/
trait NewLineMode extends StObject
object NewLineMode {
  
  inline def auto: typings.ace.aceStrings.auto = "auto".asInstanceOf[typings.ace.aceStrings.auto]
  
  inline def unix: typings.ace.aceStrings.unix = "unix".asInstanceOf[typings.ace.aceStrings.unix]
  
  inline def windows: typings.ace.aceStrings.windows = "windows".asInstanceOf[typings.ace.aceStrings.windows]
}
