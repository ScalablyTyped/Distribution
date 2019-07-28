package typings.atlassianDashCrowdDashClient

import typings.atlassianDashCrowdDashClient.libModelsSessionMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Create extends js.Object {
  def create(username: String, password: String): js.Promise[^] = js.native
  def create(
    username: String,
    password: String,
    validationFactors: typings.atlassianDashCrowdDashClient.libModelsValidationDashFactorsMod.^
  ): js.Promise[^] = js.native
  def create(
    username: String,
    password: String,
    validationFactors: typings.atlassianDashCrowdDashClient.libModelsValidationDashFactorsMod.^,
    duration: Double
  ): js.Promise[^] = js.native
  def createUnvalidated(username: String): js.Promise[^] = js.native
  def createUnvalidated(
    username: String,
    validationFactors: typings.atlassianDashCrowdDashClient.libModelsValidationDashFactorsMod.^
  ): js.Promise[^] = js.native
  def createUnvalidated(
    username: String,
    validationFactors: typings.atlassianDashCrowdDashClient.libModelsValidationDashFactorsMod.^,
    duration: Double
  ): js.Promise[^] = js.native
  def getUser(token: String): js.Promise[typings.atlassianDashCrowdDashClient.libModelsUserMod.^] = js.native
  def remove(token: String): js.Promise[Unit] = js.native
  def removeAll(username: String): js.Promise[Unit] = js.native
  def removeAll(username: String, exclude: String): js.Promise[Unit] = js.native
  def validate(token: String): js.Promise[^] = js.native
  def validate(
    token: String,
    validationFactors: typings.atlassianDashCrowdDashClient.libModelsValidationDashFactorsMod.^
  ): js.Promise[^] = js.native
}

