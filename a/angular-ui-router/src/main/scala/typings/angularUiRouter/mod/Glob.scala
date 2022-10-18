package typings.angularUiRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("angular-ui-router", "Glob")
@js.native
open class Glob protected ()
  extends typings.uirouterCore.mod.Glob {
  def this(text: String) = this()
}
/* static members */
object Glob {
  
  @JSImport("angular-ui-router", "Glob")
  @js.native
  val ^ : js.Any = js.native
  
  /** Returns a glob from the string, or null if the string isn't Glob-like */
  inline def fromString(text: String): typings.uirouterCore.libCommonGlobMod.Glob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(text.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libCommonGlobMod.Glob]
  
  /** Returns true if the string has glob-like characters in it */
  inline def is(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
