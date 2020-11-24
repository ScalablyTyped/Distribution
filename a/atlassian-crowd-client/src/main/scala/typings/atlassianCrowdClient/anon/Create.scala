package typings.atlassianCrowdClient.anon

import typings.atlassianCrowdClient.sessionMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Create extends js.Object {
  
  def create(username: String, password: String): js.Promise[^] = js.native
  def create(username: String, password: String, validationFactors: js.UndefOr[scala.Nothing], duration: Double): js.Promise[^] = js.native
  def create(
    username: String,
    password: String,
    validationFactors: typings.atlassianCrowdClient.validationFactorsMod.^
  ): js.Promise[^] = js.native
  def create(
    username: String,
    password: String,
    validationFactors: typings.atlassianCrowdClient.validationFactorsMod.^,
    duration: Double
  ): js.Promise[^] = js.native
  
  def createUnvalidated(username: String): js.Promise[^] = js.native
  def createUnvalidated(username: String, validationFactors: js.UndefOr[scala.Nothing], duration: Double): js.Promise[^] = js.native
  def createUnvalidated(username: String, validationFactors: typings.atlassianCrowdClient.validationFactorsMod.^): js.Promise[^] = js.native
  def createUnvalidated(
    username: String,
    validationFactors: typings.atlassianCrowdClient.validationFactorsMod.^,
    duration: Double
  ): js.Promise[^] = js.native
  
  def getUser(token: String): js.Promise[typings.atlassianCrowdClient.userMod.^] = js.native
  
  def remove(token: String): js.Promise[Unit] = js.native
  
  def removeAll(username: String): js.Promise[Unit] = js.native
  def removeAll(username: String, exclude: String): js.Promise[Unit] = js.native
  
  def validate(token: String): js.Promise[^] = js.native
  def validate(token: String, validationFactors: typings.atlassianCrowdClient.validationFactorsMod.^): js.Promise[^] = js.native
}
