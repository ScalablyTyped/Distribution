package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object listBodyMod {
  
  type OmitProp = typings.antd.typeMod.ElementOf[
    js.Tuple3[
      typings.antd.antdStrings.handleFilter, 
      typings.antd.antdStrings.handleClear, 
      typings.antd.antdStrings.checkedKeys
    ]
  ]
  
  type PartialTransferListProps[RecordType] = typings.antd.typeMod.Omit[
    typings.antd.transferListMod.TransferListProps[RecordType], 
    typings.antd.listBodyMod.OmitProp
  ]
}
