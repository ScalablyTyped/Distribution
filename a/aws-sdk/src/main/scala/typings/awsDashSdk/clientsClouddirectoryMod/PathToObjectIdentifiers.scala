package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathToObjectIdentifiers extends js.Object {
  /**
    * Lists ObjectIdentifiers starting from directory root to the object in the request.
    */
  var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.native
  /**
    * The path that is used to identify the object starting from directory root.
    */
  var Path: js.UndefOr[PathString] = js.native
}

object PathToObjectIdentifiers {
  @scala.inline
  def apply(ObjectIdentifiers: ObjectIdentifierList = null, Path: PathString = null): PathToObjectIdentifiers = {
    val __obj = js.Dynamic.literal()
    if (ObjectIdentifiers != null) __obj.updateDynamic("ObjectIdentifiers")(ObjectIdentifiers.asInstanceOf[js.Any])
    if (Path != null) __obj.updateDynamic("Path")(Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathToObjectIdentifiers]
  }
}

