package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Create extends js.Object {
  def create(username: java.lang.String, password: java.lang.String): js.Promise[atlassianDashCrowdDashClientLib.libModelsSessionMod.namespaced] = js.native
  def create(
    username: java.lang.String,
    password: java.lang.String,
    validationFactors: atlassianDashCrowdDashClientLib.libModelsValidationDashFactorsMod.namespaced
  ): js.Promise[atlassianDashCrowdDashClientLib.libModelsSessionMod.namespaced] = js.native
  def create(
    username: java.lang.String,
    password: java.lang.String,
    validationFactors: atlassianDashCrowdDashClientLib.libModelsValidationDashFactorsMod.namespaced,
    duration: scala.Double
  ): js.Promise[atlassianDashCrowdDashClientLib.libModelsSessionMod.namespaced] = js.native
  def createUnvalidated(username: java.lang.String): js.Promise[atlassianDashCrowdDashClientLib.libModelsSessionMod.namespaced] = js.native
  def createUnvalidated(
    username: java.lang.String,
    validationFactors: atlassianDashCrowdDashClientLib.libModelsValidationDashFactorsMod.namespaced
  ): js.Promise[atlassianDashCrowdDashClientLib.libModelsSessionMod.namespaced] = js.native
  def createUnvalidated(
    username: java.lang.String,
    validationFactors: atlassianDashCrowdDashClientLib.libModelsValidationDashFactorsMod.namespaced,
    duration: scala.Double
  ): js.Promise[atlassianDashCrowdDashClientLib.libModelsSessionMod.namespaced] = js.native
  def getUser(token: java.lang.String): js.Promise[atlassianDashCrowdDashClientLib.libModelsUserMod.namespaced] = js.native
  def remove(token: java.lang.String): js.Promise[scala.Unit] = js.native
  def removeAll(username: java.lang.String): js.Promise[scala.Unit] = js.native
  def removeAll(username: java.lang.String, exclude: java.lang.String): js.Promise[scala.Unit] = js.native
  def validate(token: java.lang.String): js.Promise[atlassianDashCrowdDashClientLib.libModelsSessionMod.namespaced] = js.native
  def validate(
    token: java.lang.String,
    validationFactors: atlassianDashCrowdDashClientLib.libModelsValidationDashFactorsMod.namespaced
  ): js.Promise[atlassianDashCrowdDashClientLib.libModelsSessionMod.namespaced] = js.native
}

