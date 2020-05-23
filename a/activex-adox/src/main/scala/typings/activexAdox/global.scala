package typings.activexAdox

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object ADOX extends js.Object {
    @js.native
    class Catalog protected ()
      extends typings.activexAdox.ADOX.Catalog
    
    @js.native
    class Column protected ()
      extends typings.activexAdox.ADOX.Column
    
    @js.native
    class Group protected ()
      extends typings.activexAdox.ADOX.Group
    
    @js.native
    class Index protected ()
      extends typings.activexAdox.ADOX.Index
    
    @js.native
    class Key protected ()
      extends typings.activexAdox.ADOX.Key
    
    @js.native
    class Procedure protected ()
      extends typings.activexAdox.ADOX.Procedure {
      /* CompleteClass */
      @JSName("ADOX.Procedure_typekey")
      override var ADOXDotProcedure_typekey: typings.activexAdox.ADOX.Procedure = js.native
      /* CompleteClass */
      override var Command: typings.activexAdodb.ADODB.Command = js.native
      /* CompleteClass */
      override val DateCreated: VarDate | Null = js.native
      /* CompleteClass */
      override val DateModified: VarDate | Null = js.native
      /* CompleteClass */
      override val Name: String = js.native
    }
    
    @js.native
    class Table protected ()
      extends typings.activexAdox.ADOX.Table
    
    @js.native
    class User protected ()
      extends typings.activexAdox.ADOX.User
    
    @js.native
    class View protected ()
      extends typings.activexAdox.ADOX.View {
      /* CompleteClass */
      @JSName("ADOX.View_typekey")
      override var ADOXDotView_typekey: typings.activexAdox.ADOX.View = js.native
      /* CompleteClass */
      override var Command: typings.activexAdodb.ADODB.Command = js.native
      /* CompleteClass */
      override val DateCreated: VarDate = js.native
      /* CompleteClass */
      override val DateModified: VarDate = js.native
      /* CompleteClass */
      override val Name: String = js.native
    }
    
  }
  
}

