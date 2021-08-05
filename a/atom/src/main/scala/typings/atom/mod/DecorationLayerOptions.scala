package typings.atom.mod

import typings.atom.atomStrings.`line-number`
import typings.atom.atomStrings.block
import typings.atom.atomStrings.cursor_
import typings.atom.atomStrings.highlight
import typings.atom.atomStrings.line
import typings.atom.atomStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecorationLayerOptions
  extends StObject
     with SharedDecorationOptions {
  
  /** One of several supported decoration types. */
  var `type`: js.UndefOr[line | `line-number` | text | highlight | block | cursor_] = js.undefined
}
object DecorationLayerOptions {
  
  inline def apply(): DecorationLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecorationLayerOptions]
  }
  
  extension [Self <: DecorationLayerOptions](x: Self) {
    
    inline def setType(value: line | `line-number` | text | highlight | block | cursor_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
