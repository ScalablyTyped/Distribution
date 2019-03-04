package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageEntitlement extends js.Object {
  /** List of entitlements for a given app. */
  var entitlements: js.Array[Entitlement]
  /** Name of the Android app package. */
  var packageName: java.lang.String
}

object PackageEntitlement {
  @scala.inline
  def apply(entitlements: js.Array[Entitlement], packageName: java.lang.String): PackageEntitlement = {
    val __obj = js.Dynamic.literal(entitlements = entitlements, packageName = packageName)
  
    __obj.asInstanceOf[PackageEntitlement]
  }
}

