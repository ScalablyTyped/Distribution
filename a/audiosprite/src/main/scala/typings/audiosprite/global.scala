package typings.audiosprite

import typings.audiosprite.mod.Option
import typings.audiosprite.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def audiosprite(files: js.Array[String], callback: js.Function2[/* error */ js.Error, /* obj */ Result, Unit]): Unit = (js.Dynamic.global.applyDynamic("audiosprite")(files.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def audiosprite(
    files: js.Array[String],
    option: Option,
    callback: js.Function2[/* error */ js.Error, /* obj */ Result, Unit]
  ): Unit = (js.Dynamic.global.applyDynamic("audiosprite")(files.asInstanceOf[js.Any], option.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
