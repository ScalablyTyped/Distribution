package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndKey extends js.Object {
  var endKey: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ js.Any
  ] = js.undefined
  var expandedKeys: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
  ]
  var startKey: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ js.Any
  ] = js.undefined
  var treeData: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataNode */ _
  ]
}

object EndKey {
  @scala.inline
  def apply(
    expandedKeys: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
    ],
    treeData: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataNode */ _
    ],
    endKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ js.Any = null,
    startKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ js.Any = null
  ): EndKey = {
    val __obj = js.Dynamic.literal(expandedKeys = expandedKeys.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    if (endKey != null) __obj.updateDynamic("endKey")(endKey.asInstanceOf[js.Any])
    if (startKey != null) __obj.updateDynamic("startKey")(startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndKey]
  }
}

