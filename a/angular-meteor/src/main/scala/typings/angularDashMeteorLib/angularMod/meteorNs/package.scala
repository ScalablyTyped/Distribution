package typings
package angularDashMeteorLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object meteorNs {
  /**
    * An object that connects a Meteor Collection to an AngularJS scope variable
    */
  type AngularMeteorCollection[T] = AngularMeteorCollection2[T, T]
  type ILoginWithExternalService = js.Function1[
    /* options */ meteorLib.MeteorNs.LoginWithExternalServiceOptions, 
    angularLib.angularMod.angularNs.IPromise[scala.Unit]
  ]
}
