package typings.atApolloProtobufjs.atApolloProtobufjsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atApolloProtobufjs.atApolloProtobufjsMod.AnyNestedObject because Already inherited */ trait IService extends INamespace {
  /** Method descriptors */
  var methods: StringDictionary[IMethod]
}

object IService {
  @scala.inline
  def apply(
    methods: StringDictionary[IMethod],
    nested: StringDictionary[AnyNestedObject] = null,
    options: StringDictionary[js.Any] = null
  ): IService = {
    val __obj = js.Dynamic.literal(methods = methods)
    if (nested != null) __obj.updateDynamic("nested")(nested)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[IService]
  }
}

