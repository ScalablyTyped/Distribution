package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.base64
import typings.appBuilderLib.appBuilderLibStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashMod {
  
  @JSImport("app-builder-lib/out/util/hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hashFile(file: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("hashFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def hashFile(file: String, algorithm: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashFile")(file.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def hashFile(file: String, algorithm: String, encoding: base64 | hex): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashFile")(file.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def hashFile(file: String, algorithm: String, encoding: base64 | hex, options: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashFile")(file.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def hashFile(file: String, algorithm: String, encoding: Unit, options: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashFile")(file.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def hashFile(file: String, algorithm: Unit, encoding: base64 | hex): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashFile")(file.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def hashFile(file: String, algorithm: Unit, encoding: base64 | hex, options: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashFile")(file.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def hashFile(file: String, algorithm: Unit, encoding: Unit, options: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashFile")(file.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
