package typings
package awsDashSdkLib.libSharedDashIniIniDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/shared-ini/ini-loader", "IniLoader")
@js.native
class IniLoader () extends js.Object {
  /** Remove all cached files. Used after config files are updated. */
  def clearCachedFiles(): scala.Unit = js.native
  /**
    * Load configurations from config/credentials files and cache them 
    * for later use. If no file is specified it will try to load default
    * files.
    * @returns {object} object of all profile information in the file
    */
  def loadFrom(options: LoadFileOptions): IniFileContent = js.native
}

