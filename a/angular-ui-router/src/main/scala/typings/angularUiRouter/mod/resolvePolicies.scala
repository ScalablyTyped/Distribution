package typings.angularUiRouter.mod

import typings.uirouterCore.anon.EAGER
import typings.uirouterCore.anon.NOWAIT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolvePolicies {
  
  @JSImport("angular-ui-router", "resolvePolicies")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("angular-ui-router", "resolvePolicies.async")
  @js.native
  def async: NOWAIT = js.native
  inline def async_=(x: NOWAIT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("async")(x.asInstanceOf[js.Any])
  
  @JSImport("angular-ui-router", "resolvePolicies.when")
  @js.native
  def when: EAGER = js.native
  inline def when_=(x: EAGER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("when")(x.asInstanceOf[js.Any])
}
