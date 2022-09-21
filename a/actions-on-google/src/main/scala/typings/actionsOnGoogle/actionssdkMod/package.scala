package typings.actionsOnGoogle.actionssdkMod

import typings.actionsOnGoogle.actionssdkActionssdkMod.ActionsSdk_
import typings.actionsOnGoogle.actionssdkMod.^
import typings.actionsOnGoogle.optionOptionMod.ApiOptionItem
import typings.actionsOnGoogle.optionOptionMod.OptionItem
import typings.actionsOnGoogle.optionOptionMod.OptionItems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def actionssdk: ActionsSdk_ = ^.asInstanceOf[js.Dynamic].selectDynamic("actionssdk").asInstanceOf[ActionsSdk_]

inline def convert(items: OptionItems[OptionItem | String]): js.Array[ApiOptionItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[ApiOptionItem]]
