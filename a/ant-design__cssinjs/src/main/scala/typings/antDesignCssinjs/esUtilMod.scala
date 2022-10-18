package typings.antDesignCssinjs

import typings.antDesignCssinjs.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilMod {
  
  @JSImport("@ant-design/cssinjs/es/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flattenToken(token: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenToken")(token.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def styleValidate(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("styleValidate")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def styleValidate(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("styleValidate")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def styleValidate(key: String, value: String, info: Path): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("styleValidate")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def styleValidate(key: String, value: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("styleValidate")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def styleValidate(key: String, value: Boolean, info: Path): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("styleValidate")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def styleValidate(key: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("styleValidate")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def styleValidate(key: String, value: Double, info: Path): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("styleValidate")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def styleValidate(key: String, value: Null, info: Path): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("styleValidate")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def styleValidate(key: String, value: Unit, info: Path): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("styleValidate")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def supportLayer(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportLayer")().asInstanceOf[Boolean]
  
  inline def token2key(token: Any, slat: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("token2key")(token.asInstanceOf[js.Any], slat.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def warning(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warning")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def warning(message: String, path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")(message.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
