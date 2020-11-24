package typings.angularMeteor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object meteor {
  
  /**
    * An object that connects a Meteor Collection to an AngularJS scope variable
    */
  type AngularMeteorCollection[T] = typings.angularMeteor.mod.meteor.AngularMeteorCollection2[T, T]
  
  type ILoginWithExternalService = js.Function1[
    /* options */ typings.meteor.Meteor.LoginWithExternalServiceOptions, 
    typings.angular.mod.IPromise[scala.Unit]
  ]
}
