package typings.airbnbDashPropDashTypes.airbnbDashPropDashTypesMod

import typings.propDashTypes.propDashTypesMod.Requireable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "restrictedProp")
@js.native
object restrictedProp extends js.Object {
  def apply[T](): Requireable[T] = js.native
  def apply[T](
    messageFunction: js.Function5[
      /* props */ js.Object, 
      /* propName */ String, 
      /* componentName */ String, 
      /* location */ String, 
      /* propFullName */ String, 
      js.UndefOr[String | Error]
    ]
  ): Requireable[T] = js.native
}

