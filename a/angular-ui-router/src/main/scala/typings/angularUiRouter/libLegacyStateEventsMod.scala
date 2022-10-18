package typings.angularUiRouter

import typings.angular.mod.IAngularEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLegacyStateEventsMod {
  
  @JSImport("angular-ui-router/lib/legacy/stateEvents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("angular-ui-router/lib/legacy/stateEvents", "$stateChangeCancel")
  @js.native
  def stateChangeCancel: IAngularEvent = js.native
  
  inline def stateChangeCancel_=(x: IAngularEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$stateChangeCancel")(x.asInstanceOf[js.Any])
  
  @JSImport("angular-ui-router/lib/legacy/stateEvents", "$stateChangeError")
  @js.native
  def stateChangeError: IAngularEvent = js.native
  
  inline def stateChangeError_=(x: IAngularEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$stateChangeError")(x.asInstanceOf[js.Any])
  
  @JSImport("angular-ui-router/lib/legacy/stateEvents", "$stateChangeStart")
  @js.native
  def stateChangeStart: IAngularEvent = js.native
  
  inline def stateChangeStart_=(x: IAngularEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$stateChangeStart")(x.asInstanceOf[js.Any])
  
  @JSImport("angular-ui-router/lib/legacy/stateEvents", "$stateChangeSuccess")
  @js.native
  def stateChangeSuccess: IAngularEvent = js.native
  
  inline def stateChangeSuccess_=(x: IAngularEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$stateChangeSuccess")(x.asInstanceOf[js.Any])
  
  @JSImport("angular-ui-router/lib/legacy/stateEvents", "$stateNotFound")
  @js.native
  def stateNotFound: IAngularEvent = js.native
  
  inline def stateNotFound_=(x: IAngularEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$stateNotFound")(x.asInstanceOf[js.Any])
}
