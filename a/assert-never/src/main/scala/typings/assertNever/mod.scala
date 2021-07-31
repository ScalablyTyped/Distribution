package typings.assertNever

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("assert-never", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(value: scala.Nothing): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  @scala.inline
  def default(value: scala.Nothing, noThrow: Boolean): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], noThrow.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def assertNever(value: scala.Nothing): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNever")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  @scala.inline
  def assertNever(value: scala.Nothing, noThrow: Boolean): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNever")(value.asInstanceOf[js.Any], noThrow.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
}
