package typings.apigeeDashAccess.apigeeDashAccessMod

import typings.apigeeDashAccess.apigeeDashAccessMod.ApigeeAccess.CacheOptions
import typings.apigeeDashAccess.apigeeDashAccessMod.ApigeeAccess.QuotaService
import typings.apigeeDashAccess.apigeeDashAccessMod.ApigeeAccess.SecureVault
import typings.apigeeDashAccess.apigeeDashAccessStrings.apigee
import typings.apigeeDashAccess.apigeeDashAccessStrings.environment
import typings.apigeeDashAccess.apigeeDashAccessStrings.organization
import typings.apigeeDashAccess.apigeeDashAccessStrings.standalone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apigee-access", JSImport.Default)
@js.native
object default extends js.Object {
  def deleteVariable(request: js.Any, name: String): Unit = js.native
  def getCache(name: String): js.Any = js.native
  def getCache(name: String, options: CacheOptions): js.Any = js.native
  def getMode(): apigee | standalone = js.native
  def getQuota(): QuotaService = js.native
  def getQuota(options: js.Any): QuotaService = js.native
  def getVariable(request: js.Any, name: String): String | Double | Boolean = js.native
  def getVault(name: String): SecureVault = js.native
  @JSName("getVault")
  def getVault_environment(name: String, scope: environment): SecureVault = js.native
  @JSName("getVault")
  def getVault_organization(name: String, scope: organization): SecureVault = js.native
  def setIntVariable(request: js.Any, name: String, value: String): Unit = js.native
  def setIntVariable(request: js.Any, name: String, value: Double): Unit = js.native
  def setVariable(request: js.Any, name: String, value: String): Unit = js.native
  def setVariable(request: js.Any, name: String, value: Boolean): Unit = js.native
  def setVariable(request: js.Any, name: String, value: Double): Unit = js.native
}

