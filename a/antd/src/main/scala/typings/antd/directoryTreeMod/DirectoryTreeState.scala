package typings.antd.directoryTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryTreeState extends js.Object {
  var expandedKeys: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
    ]
  ] = js.undefined
  var selectedKeys: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
    ]
  ] = js.undefined
}

object DirectoryTreeState {
  @scala.inline
  def apply(
    expandedKeys: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
    ] = null,
    selectedKeys: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
    ] = null
  ): DirectoryTreeState = {
    val __obj = js.Dynamic.literal()
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryTreeState]
  }
}

