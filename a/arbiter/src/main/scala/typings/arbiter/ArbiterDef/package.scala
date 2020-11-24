package typings.arbiter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ArbiterDef {
  
  type SubscribeHandler = js.Function3[
    /* data */ js.Any, 
    /* message */ java.lang.String, 
    /* subscriber_context */ js.Any, 
    scala.Unit
  ]
}
