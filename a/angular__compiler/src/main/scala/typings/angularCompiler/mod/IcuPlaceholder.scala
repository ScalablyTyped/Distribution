package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IcuPlaceholder
  extends StObject
     with Node3 {
  
  var name: String = js.native
  
  /** Used to capture a message computed from a previous processing pass (see `setI18nRefs()`). */
  var previousMessage: js.UndefOr[Message] = js.native
  
  var value: Icu = js.native
}
