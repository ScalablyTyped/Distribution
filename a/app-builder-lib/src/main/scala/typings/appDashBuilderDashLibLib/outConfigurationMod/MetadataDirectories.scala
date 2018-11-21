package typings
package appDashBuilderDashLibLib.outConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MetadataDirectories extends js.Object {
  /**
       * The application directory (containing the application package.json), defaults to `app`, `www` or working directory.
       */
  val app: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The path to build resources.
       *
       * Please note — build resources is not packed into the app. If you need to use some files, e.g. as tray icon, please include required files explicitly: `"files": ["**\/ *", "build/icon.*"]`
       * @default build
       */
  val buildResources: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The output directory. [File macros](/file-patterns.md#file-macros) are supported.
       * @default dist
       */
  val output: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

