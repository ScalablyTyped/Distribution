package typings.antd

import typings.antd.libFormFormItemMod.ValidateStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilStatusUtilsMod {
  
  @JSImport("antd/lib/_util/statusUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMergedStatus(): js.UndefOr["" | "success" | "warning" | "error" | "validating"] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMergedStatus")().asInstanceOf[js.UndefOr["" | "success" | "warning" | "error" | "validating"]]
  inline def getMergedStatus(contextStatus: Unit, customStatus: InputStatus): js.UndefOr["" | "success" | "warning" | "error" | "validating"] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMergedStatus")(contextStatus.asInstanceOf[js.Any], customStatus.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr["" | "success" | "warning" | "error" | "validating"]]
  inline def getMergedStatus(contextStatus: ValidateStatus): js.UndefOr["" | "success" | "warning" | "error" | "validating"] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMergedStatus")(contextStatus.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr["" | "success" | "warning" | "error" | "validating"]]
  inline def getMergedStatus(contextStatus: ValidateStatus, customStatus: InputStatus): js.UndefOr["" | "success" | "warning" | "error" | "validating"] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMergedStatus")(contextStatus.asInstanceOf[js.Any], customStatus.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr["" | "success" | "warning" | "error" | "validating"]]
  
  inline def getStatusClassNames(prefixCls: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusClassNames")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getStatusClassNames(prefixCls: String, status: Unit, hasFeedback: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatusClassNames")(prefixCls.asInstanceOf[js.Any], status.asInstanceOf[js.Any], hasFeedback.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getStatusClassNames(prefixCls: String, status: ValidateStatus): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatusClassNames")(prefixCls.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getStatusClassNames(prefixCls: String, status: ValidateStatus, hasFeedback: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatusClassNames")(prefixCls.asInstanceOf[js.Any], status.asInstanceOf[js.Any], hasFeedback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type InputStatus = "warning" | "error" | ""
}
