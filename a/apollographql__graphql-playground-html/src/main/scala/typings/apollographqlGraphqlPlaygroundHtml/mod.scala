package typings.apollographqlGraphqlPlaygroundHtml

import typings.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.RenderPageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@apollographql/graphql-playground-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def renderPlaygroundPage(options: RenderPageOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderPlaygroundPage")(options.asInstanceOf[js.Any]).asInstanceOf[String]
}
