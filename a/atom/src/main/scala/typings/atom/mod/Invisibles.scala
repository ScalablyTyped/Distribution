package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Invisibles extends StObject {
  
  /**
    *  Character used to render carriage return characters (for Microsoft-style line
    *  endings) when the `Show Invisibles` setting is enabled.
    */
  var cr: js.UndefOr[Boolean | String] = js.native
  
  /**
    *  Character used to render newline characters (\n) when the `Show Invisibles`
    *  setting is enabled.
    */
  var eol: js.UndefOr[Boolean | String] = js.native
  
  /**
    *  Character used to render leading and trailing space characters when the
    *  `Show Invisibles` setting is enabled.
    */
  var space: js.UndefOr[Boolean | String] = js.native
  
  /**
    *  Character used to render hard tab characters (\t) when the `Show Invisibles`
    *  setting is enabled.
    */
  var tab: js.UndefOr[Boolean | String] = js.native
}
object Invisibles {
  
  @scala.inline
  def apply(): Invisibles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invisibles]
  }
  
  @scala.inline
  implicit class InvisiblesMutableBuilder[Self <: Invisibles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCr(value: Boolean | String): Self = StObject.set(x, "cr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrUndefined: Self = StObject.set(x, "cr", js.undefined)
    
    @scala.inline
    def setEol(value: Boolean | String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
    
    @scala.inline
    def setSpace(value: Boolean | String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    @scala.inline
    def setTab(value: Boolean | String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
  }
}
