package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceServerScopeType extends js.Object {
  /**
    * A description of the scope.
    */
  var ScopeDescription: ResourceServerScopeDescriptionType
  /**
    * The name of the scope.
    */
  var ScopeName: ResourceServerScopeNameType
}

object ResourceServerScopeType {
  @scala.inline
  def apply(ScopeDescription: ResourceServerScopeDescriptionType, ScopeName: ResourceServerScopeNameType): ResourceServerScopeType = {
    val __obj = js.Dynamic.literal(ScopeDescription = ScopeDescription, ScopeName = ScopeName)
  
    __obj.asInstanceOf[ResourceServerScopeType]
  }
}

