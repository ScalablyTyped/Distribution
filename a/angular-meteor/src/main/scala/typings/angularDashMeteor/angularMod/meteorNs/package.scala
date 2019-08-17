package typings.angularDashMeteor.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object meteorNs {
  import typings.angular.angularMod.IPromise
  import typings.meteor.MeteorNs.LoginWithExternalServiceOptions

  /**
    * An object that connects a Meteor Collection to an AngularJS scope variable
    */
  type AngularMeteorCollection[T] = AngularMeteorCollection2[T, T]
  type ILoginWithExternalService = js.Function1[/* options */ LoginWithExternalServiceOptions, IPromise[Unit]]
}
