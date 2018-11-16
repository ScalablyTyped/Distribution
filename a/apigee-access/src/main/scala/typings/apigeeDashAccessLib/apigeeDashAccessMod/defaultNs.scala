package typings
package apigeeDashAccessLib.apigeeDashAccessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apigee-access", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  def deleteVariable(request: js.Any, name: java.lang.String): scala.Unit = js.native
  def getCache(name: java.lang.String): js.Any = js.native
  def getCache(
    name: java.lang.String,
    options: apigeeDashAccessLib.apigeeDashAccessMod.ApigeeAccessNs.CacheOptions
  ): js.Any = js.native
  def getMode(): apigeeDashAccessLib.apigeeDashAccessLibStrings.apigee | apigeeDashAccessLib.apigeeDashAccessLibStrings.standalone = js.native
  def getQuota(): apigeeDashAccessLib.apigeeDashAccessMod.ApigeeAccessNs.QuotaService = js.native
  def getQuota(options: js.Any): apigeeDashAccessLib.apigeeDashAccessMod.ApigeeAccessNs.QuotaService = js.native
  def getVariable(request: js.Any, name: java.lang.String): java.lang.String | scala.Double | scala.Boolean = js.native
  def getVault(name: java.lang.String): apigeeDashAccessLib.apigeeDashAccessMod.ApigeeAccessNs.SecureVault = js.native
  @JSName("getVault")
  def getVault_environment(name: java.lang.String, scope: apigeeDashAccessLib.apigeeDashAccessLibStrings.environment): apigeeDashAccessLib.apigeeDashAccessMod.ApigeeAccessNs.SecureVault = js.native
  @JSName("getVault")
  def getVault_organization(name: java.lang.String, scope: apigeeDashAccessLib.apigeeDashAccessLibStrings.organization): apigeeDashAccessLib.apigeeDashAccessMod.ApigeeAccessNs.SecureVault = js.native
  def setIntVariable(request: js.Any, name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setIntVariable(request: js.Any, name: java.lang.String, value: scala.Double): scala.Unit = js.native
  def setVariable(request: js.Any, name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setVariable(request: js.Any, name: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  def setVariable(request: js.Any, name: java.lang.String, value: scala.Double): scala.Unit = js.native
}

